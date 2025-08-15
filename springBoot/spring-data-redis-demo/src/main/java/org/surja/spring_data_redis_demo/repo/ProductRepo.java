package org.surja.spring_data_redis_demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.surja.spring_data_redis_demo.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
