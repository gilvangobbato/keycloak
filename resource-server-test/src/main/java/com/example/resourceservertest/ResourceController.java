package com.example.resourceservertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping(value = "/api")
public class ResourceController {

    @RolesAllowed("ROLE_ADMIN")
    @GetMapping(value = "admin")
    public String getUserAdmin() {
        return "Recurso administrador permitido ";
    }

    @RolesAllowed("ROLE_USER")
    @GetMapping(value = "user")
    public String getUser(){
        return "Recurso permitido.";
    }

}
