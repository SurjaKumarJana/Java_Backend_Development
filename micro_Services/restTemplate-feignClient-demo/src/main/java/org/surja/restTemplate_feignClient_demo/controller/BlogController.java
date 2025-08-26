package org.surja.restTemplate_feignClient_demo.controller;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.surja.restTemplate_feignClient_demo.dto.BlogDto;

import java.util.Date;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public ResponseEntity<BlogDto> getBlogById(@PathVariable Long id, @RequestHeader (required = false) String requestId){
        String url = "https://jsonplaceholder.typicode.com/posts/"+id;
        BlogDto blogDto = restTemplate.getForObject(url,BlogDto.class);
        blogDto.setServerDateTime(new Date());
        return ResponseEntity.ok(blogDto);
    }

}
