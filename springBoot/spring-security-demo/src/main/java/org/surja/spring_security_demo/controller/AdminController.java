package org.surja.spring_security_demo.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.surja.spring_security_demo.entity.AppUser;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/hello")
    public String adminSecificApi(@AuthenticationPrincipal AppUser user){

        return "Hello ADMIN ! "+ user.getName() +" from "+Thread.currentThread().getName();
    }


}
