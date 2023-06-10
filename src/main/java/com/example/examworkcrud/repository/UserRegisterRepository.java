package com.example.examworkcrud.repository;

import com.example.examworkcrud.entity.UserRegisterEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegisterRepository extends JpaRepository<UserRegisterEntity,Long> {

    UserRegisterEntity findByUsername( String username);

    UserRegisterEntity findByEmail(String email);
}
