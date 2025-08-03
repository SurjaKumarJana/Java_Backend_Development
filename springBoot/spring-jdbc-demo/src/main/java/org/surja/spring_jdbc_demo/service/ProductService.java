package org.surja.spring_jdbc_demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.surja.spring_jdbc_demo.dao.ProductSpringJDBCDao;
import org.surja.spring_jdbc_demo.entity.Product;

@Service
public class ProductService {

//    @Autowired
//    private ProductDao productDAO;

    @Autowired
    private ProductSpringJDBCDao productDAO;

    public Product getById(Long id){

        return productDAO.getById(id);
    }


    public Product create(Product product){
        return productDAO.create(product);
    }

    public Product update(Long id, Product product){
        return productDAO.update(id,product);
    }

    public Product delete(Long id){
        return productDAO.delete(id);
    }


}
