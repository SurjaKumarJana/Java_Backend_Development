package org.surja.product_service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    private static Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @PostMapping
    public ResponseEntity< Product> createProduct(@RequestBody Product product , @RequestHeader(required = false) String requestId){
        LOGGER.info(" processing  create product request  : {} ",requestId);
        Product result= productService.createProduct(product);
        LOGGER.info("product created");
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id, @RequestHeader(required = false) String requestId){
        LOGGER.info(" processing  get product request  : {} ",requestId);
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Product>> getAll(@RequestHeader(required = false) String requestId){
        LOGGER.info(" processing  get all product request  : {} ",requestId);
        List<Product> productList = productService.getAll();
        return ResponseEntity.ok(productList);
    }



}
