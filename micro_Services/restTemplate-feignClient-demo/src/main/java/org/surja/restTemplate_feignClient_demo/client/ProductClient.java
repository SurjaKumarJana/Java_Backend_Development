package org.surja.restTemplate_feignClient_demo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.surja.restTemplate_feignClient_demo.dto.ProductDto;

import java.util.List;

@FeignClient(name = "products", url = "http://localhost:8080")
public interface ProductClient {


    @PostMapping("/product")
    ProductDto createProduct(@RequestBody ProductDto product , @RequestHeader(required = false) String requestId);

    @GetMapping("/product/getAll")
    List<ProductDto> getAll(@RequestHeader(required = false) String requestId);
}
