package org.surja.restTemplate_feignClient_demo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.surja.restTemplate_feignClient_demo.dto.BlogDto;

@FeignClient(name = "blogs", url = "https://jsonplaceholder.typicode.com")
public interface BlogClient {

    @GetMapping("/posts/{id}")
    BlogDto getBlogById(@PathVariable Long id);


}
