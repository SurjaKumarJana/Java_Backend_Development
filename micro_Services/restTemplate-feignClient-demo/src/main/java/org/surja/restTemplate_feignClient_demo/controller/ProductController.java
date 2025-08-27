package org.surja.restTemplate_feignClient_demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.surja.restTemplate_feignClient_demo.client.ProductClient;
import org.surja.restTemplate_feignClient_demo.dto.ProductDto;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductClient productClient;

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto , @RequestHeader String requestId){
        LOGGER.info("processing request for create product requestId : {}",requestId);
        ProductDto response = productClient.createProduct(productDto,requestId);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<ProductDto>> getAllProduct(@RequestHeader String requestId){
        LOGGER.info("processing request for get all product requestId : {}", requestId);
        List<ProductDto> products = productClient.getAll(requestId);
        return ResponseEntity.ok(products);
    }
}
