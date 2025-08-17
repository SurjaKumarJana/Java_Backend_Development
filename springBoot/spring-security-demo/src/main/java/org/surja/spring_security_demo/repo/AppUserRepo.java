package org.surja.spring_security_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.surja.spring_security_demo.entity.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository <AppUser,Long>{

    public AppUser findByEmail(String email);
}
