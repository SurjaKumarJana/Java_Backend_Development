package org.surja.spring_jdbc_demo.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.surja.spring_jdbc_demo.entity.Product;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductSpringJDBCDao {

    @Autowired
    private ProductMapper productMapper;

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Value("${product.query.find.by.id}")
    private String findById;

    public Product getById(Long id) {
        // call DB
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("id", id);
        List<Product> products = namedParameterJdbcTemplate.query(findById,parameterSource, productMapper);
        if(!products.isEmpty()){
            return products.get(0);
        }
        return null;
    }



    public Product create(Product product) {
        String insertQuery = "insert into product (name, cost) values (:name, :cost)";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("name", product.getName());
        parameterSource.addValue("cost", product.getCost());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(insertQuery,parameterSource,keyHolder);
        product.setId(keyHolder.getKey().longValue());
        return product;
    }

    public Product update(Long id, Product product) {
        return null;
    }

    public Product delete(Long id) {
        return null;
    }


}
