package org.surja.spring_data_jpa_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.surja.spring_data_jpa_demo.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
