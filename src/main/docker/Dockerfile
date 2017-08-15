FROM java:8
VOLUME /tmp
ADD /target/swagger-aggregate-0.1.0.jar opt/app.jar
ENV JAVA_OPTS=""
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar opt/app.jar" ]