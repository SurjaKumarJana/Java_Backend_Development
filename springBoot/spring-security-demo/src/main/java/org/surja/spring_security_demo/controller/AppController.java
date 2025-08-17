package org.surja.spring_security_demo.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.surja.spring_security_demo.entity.AppUser;

@RestController
@RequestMapping("/app")
public class AppController {

    //generating dynamic content based on user details;
    // accessing user details:
    // 1. annotation based approach : @AuthenticationPrincipal AppUser user
    // 2. field based : AppUser appUser = (AppUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    @GetMapping("/hello")
    public String getHello(@AuthenticationPrincipal AppUser user){
        //AppUser appUser = (AppUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Hello ! " + user.getName() + " from : "+ Thread.currentThread().getName();
    }



}
