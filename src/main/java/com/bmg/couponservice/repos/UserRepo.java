package com.bmg.couponservice.repos;

import com.bmg.couponservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>{
    User findByEmail(String email);
}
