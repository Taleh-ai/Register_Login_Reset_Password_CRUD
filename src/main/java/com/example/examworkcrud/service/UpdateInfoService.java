package com.example.examworkcrud.service;

import com.example.examworkcrud.util.UserRole;

public interface UpdateInfoService {
    public void updatePassword(String email,String password);
    public void updateRole(String email, UserRole role);
}
