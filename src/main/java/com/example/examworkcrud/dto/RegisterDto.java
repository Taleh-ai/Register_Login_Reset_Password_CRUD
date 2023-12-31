package com.example.examworkcrud.dto;

import com.example.examworkcrud.util.UserRole;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
    @NotNull(message = "The username should not be null!")
    @NotEmpty(message = "The username should not be empty!")
    private String username;

    @NotNull(message = "The email name should not be null!")
    @NotEmpty(message = "The email name should not be empty!")
    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    String email;

    @NotNull(message = "The password name should not be null!")
    @NotEmpty(message = "The password name should not be empty!")
    String password;

    private UserRole role;
}
