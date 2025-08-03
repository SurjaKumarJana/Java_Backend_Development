package org.surja.spring_data_jpa_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.surja.spring_data_jpa_demo.entity.Branch;

@Repository
public interface BranchRepo extends JpaRepository<Branch,Long> {
}
