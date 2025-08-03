package org.surja.spring_data_jpa_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.surja.spring_data_jpa_demo.dao.ProductRepo;
import org.surja.spring_data_jpa_demo.entity.Product;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product getById(Long id) {
        Product product = productRepo.findById(id).get();
        return product;
    }

    public Product create(Product product) {
        Product newProduct = productRepo.save(product);
        return newProduct;

    }

    public Product update(Long id, Product product) {
        Product existingProduct = productRepo.findById(id).get();
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setCost(product.getCost());
            productRepo.save(existingProduct);
        }
        return existingProduct;

    }

    public Product delete(Long id) {
        Product existingProduct = productRepo.findById(id).get();
        if (existingProduct != null) {
            productRepo.delete(existingProduct);
        }
        return existingProduct;
    }

}
