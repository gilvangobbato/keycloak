package com.example.resourceservertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ResourceController {

    @GetMapping(value = "admin")
    public String getUserAdmin() {
        return "Recurso administrador permitido ";
    }

    @GetMapping(value = "user")
    public String getUser(){
        return "Recurso permitido.";
    }

}
