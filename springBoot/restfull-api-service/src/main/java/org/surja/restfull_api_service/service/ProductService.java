package org.surja.restfull_api_service.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.surja.restfull_api_service.dao.ProductDAO;
import org.surja.restfull_api_service.entity.Product;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO  productDAO;

    public Product getById(Integer id){
        return productDAO.getById(id);
    }

    public Product create(Product product){
        return productDAO.creat(product);
    }

    public Product update(Integer id, Product product){
        return productDAO.update(id, product);
    }

    public Product delete(Integer id){
        return productDAO.delete(id);
    }


}
