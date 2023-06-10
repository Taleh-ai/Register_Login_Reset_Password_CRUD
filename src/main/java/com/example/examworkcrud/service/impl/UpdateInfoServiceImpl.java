package com.example.examworkcrud.service.impl;

import com.example.examworkcrud.entity.UserRegisterEntity;
import com.example.examworkcrud.repository.UserRegisterRepository;
import com.example.examworkcrud.service.UpdateInfoService;
import com.example.examworkcrud.util.UserRole;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class UpdateInfoServiceImpl implements UpdateInfoService {
    private final UserRegisterRepository userRegisterRepository;

    @Override
    public void updatePassword(String email, String password) {
        log.info("Update password function begin" );
        UserRegisterEntity byEmail = userRegisterRepository.findByEmail(email);
        if(Objects.isNull(byEmail)){
            log.info("Email not found: "+email );
        }else{
            if(byEmail.getPassword().equals(password)){
                log.info("New password can't be same with old password" );
            }else{
                byEmail.setPassword(password);
                userRegisterRepository.save(byEmail);
                log.info("Password succesfully update" );
            }
        }
    }

    @Override
    public void updateRole(String email, UserRole role) {

    }
}
