package org.surja.spring_data_jpa_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.surja.spring_data_jpa_demo.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    Employee findByEmail(String email);


}
