package org.surja.spring_security_demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {
    //in this controller we will have the public api tha can use any one ,
    // no auth req. to access this resources.

    //if we added spring security :
    // all the public apis will not directly work we need to make several changes;


    @GetMapping("/blog")

    public String getHello(){

        return "Blog content from : "+Thread.currentThread().getName();
    }
}
