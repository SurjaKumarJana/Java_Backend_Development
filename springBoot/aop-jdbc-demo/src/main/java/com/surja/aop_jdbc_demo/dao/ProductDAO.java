package com.surja.aop_jdbc_demo.dao;


import com.surja.aop_jdbc_demo.entity.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;



import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Repository
public class ProductDAO {

    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.userName}")
    private String userName;
    @Value("${db.password}")
    private String password;

    private Map<Integer, Product> dataStore = new HashMap<>();
    private AtomicInteger nextId = new AtomicInteger();

    public Product getById(int id){

        String query = "select id, name, cost from product where id = "+id;
        Product product = null;

        try(Connection con = DriverManager.getConnection(dbUrl,userName,password)){
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                product = new Product(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getDouble("cost"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return product;
    }

    //example : simple  statement
//    public Product create(Product product) {
//        try (Connection con = DriverManager.getConnection(dbUrl,userName,password)){
//            String sqlInsert = "insert into product values (null,'"+product.getName()+"',"+product.getCost()+")";
//            Statement statement = con.createStatement();
//            int affectedRow = statement.executeUpdate(sqlInsert,Statement.RETURN_GENERATED_KEYS);
//            if(affectedRow ==0){
//                throw new SQLException("Creation Failed");
//            }
//            ResultSet generatedKeys = statement.getGeneratedKeys();
//            if(generatedKeys.next()){
//                product.setId(generatedKeys.getInt(1));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return product;
//    }
    //example : prepare statement

    public Product create(Product product){

        Connection con = null;
        boolean autoCommit = false;

        try{
            con = DriverManager.getConnection(dbUrl,userName,password);
            autoCommit = con.getAutoCommit();
            con.setAutoCommit(false);
            //this is the PreparedStatement :
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
                product.setId(generatedKeys.getInt(1));
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





    public Product update(Integer id, Product product){
        Product existingProduct = dataStore.get(id);
        if(existingProduct == null){
            return null;
        }
        existingProduct.setName(product.getName());
        existingProduct.setCost(product.getCost());
        return existingProduct;
    }

    public Product delete(Integer id){
        Product existingProduct = dataStore.get(id);
        if(existingProduct == null){
            return null;
        }
        dataStore.remove(id);
        return existingProduct;
    }

}
