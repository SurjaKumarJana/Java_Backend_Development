package org.surja.spring_jdbc_demo.dao;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.surja.spring_jdbc_demo.entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return  new Product(resultSet.getLong("id"),resultSet.getString("name"),resultSet.getDouble("cost"));
    }
}
