package org.surja.spring_data_redis_demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.surja.spring_data_redis_demo.entity.Product;
import org.surja.spring_data_redis_demo.repo.ProductRepo;

import java.util.concurrent.TimeUnit;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private RedisTemplate<String, Product> redisTemplate;

    public Product getById(Long id){

        String key = "product : "+id;
        Product product = redisTemplate.opsForValue().get(key);//De-Serialization
        if(product == null){
            product = productRepo.findById(id).get();
            if(product != null){
                redisTemplate.opsForValue().set(key,product,20, TimeUnit.SECONDS);//Serialization
            }
        }

        return product;
    }


    public Long createProduct(Product product) {
        return null;
    }
}
