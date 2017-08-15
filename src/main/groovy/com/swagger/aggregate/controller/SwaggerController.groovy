package com.swagger.aggregate.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SwaggerController {
    @GetMapping(path = "/swagger")
    String redirectToSwagger() {
        return "redirect:/swagger-ui.html"
    }
}
