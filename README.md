# Swagger Aggregate Service
Spring Boot service that can aggregate a series of microservice api-docs into a single Swagger-UI.

#### Configuration:
In the **application.yml** file, configure all microservice api-docs endpoints. This is what Swagger-UI consumes.

```
documentation: 
  swagger: 
    services:   
      - 
        name: Important Service
        url: /v2/api-docs
        version: 2.0
      - 
        name: Another Service
        url: /path/to/api-docs
        version: 2.0
```

#### Customizing the api-docs path:

If you have multiple services running on the same port or are using a load balancer
that uses path mappings to determine the target service, you may need to customize
the path that is used to serve up the api-docs.

You can do this via the `springfox.documentation.swagger.v2.path` property.

```
// application.yml

springfox:
  documentation:
    swagger:
      v2:
        path: /path/to/api-docs
```


---
##### Footnotes

This application was bootstrapped from 
* [Microservices API Documentation with Swagger2](https://piotrminkowski.wordpress.com/2017/04/14/microservices-api-documentation-with-swagger2/)
* [Microservices Single Swagger](https://github.com/varghgeorge/microservices-single-swagger)
