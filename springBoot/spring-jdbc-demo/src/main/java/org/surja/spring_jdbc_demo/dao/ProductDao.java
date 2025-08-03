package org.surja.spring_jdbc_demo.dao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.surja.spring_jdbc_demo.entity.Product;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductDao {

    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    private Map<Long, Product> dataStore = new HashMap<>();

    private AtomicLong nextId = new AtomicLong(1l);

    public Product getById(Long id) {
        // call DB
        Product product = null;
        String query = "Select id, name, cost from product where id="+id;
        try (Connection conn = DriverManager.getConnection(dbUrl,username,password);) {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                product = new Product(resultSet.getLong("id"),resultSet.getString("name"),resultSet.getDouble("cost"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

//    public Product create(Product product) {
//        try (Connection con = DriverManager.getConnection(dbUrl,username,password)){
//            String sqlInsert = "insert into product values (null,'"+product.getName()+"',"+product.getCost()+")";
//            Statement statement = con.createStatement();
//            int affectedRow = statement.executeUpdate(sqlInsert,Statement.RETURN_GENERATED_KEYS);
//            if(affectedRow ==0){
//                throw new SQLException("Creation Failed");
//            }
//            ResultSet generatedKeys = statement.getGeneratedKeys();
//            if(generatedKeys.next()){
//                product.setId(generatedKeys.getLong(1));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return product;
//    }

    public Product create(Product product) {
        Connection con = null;
        boolean autoCommit = false;
        try {
            con = DriverManager.getConnection(dbUrl,username,password);
            autoCommit = con.getAutoCommit();
            con.setAutoCommit(false);
            String sqlInsert = "insert into product values (null,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sqlInsert,Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2,product.getCost());
            int affectedRow = preparedStatement.executeUpdate();
            if(affectedRow ==0){
                throw new SQLException("Creation Failed");
            }
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if(generatedKeys.next()){
                product.setId(generatedKeys.getLong(1));
            }
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
        finally {

            if(con !=null){
                try {
                    con.setAutoCommit(autoCommit);
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return product;
    }

    public Product update(Long id, Product product) {
        Product exitingProduct = dataStore.get(id);
        if (exitingProduct == null) {
            return null;
        }
        exitingProduct.setName(product.getName());
        exitingProduct.setCost(product.getCost());
        return exitingProduct;
    }

    public Product delete(Long id) {
        Product exitingProduct = dataStore.get(id);
        if (exitingProduct == null) {
            return null;
        }
        dataStore.remove(id);
        return exitingProduct;
    }

}

