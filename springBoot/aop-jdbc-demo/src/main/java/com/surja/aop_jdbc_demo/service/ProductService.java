package com.surja.aop_jdbc_demo.service;


import com.surja.aop_jdbc_demo.aspect.LogDetails;
import com.surja.aop_jdbc_demo.dao.ProductDAO;
import com.surja.aop_jdbc_demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    @LogDetails
    public Product getById(Integer id){
        return productDAO.getById(id);
    }

    public Product create(Product product){
        return productDAO.create(product);
    }

    public Product update(Integer id, Product product){
        return productDAO.update(id, product);
    }

    public Product delete(Integer id){
        return productDAO.delete(id);
    }


}
