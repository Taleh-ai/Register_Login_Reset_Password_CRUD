package com.example.examworkcrud.repository;

import com.example.examworkcrud.entity.UserRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRegisterEntity,Long> {
}
