package com.example.examworkcrud.service.impl;

import com.example.examworkcrud.dto.LoginDto;
import com.example.examworkcrud.entity.UserRegisterEntity;
import com.example.examworkcrud.repository.UserRegisterRepository;
import com.example.examworkcrud.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginServiceImpl implements LoginService {
    private final UserRegisterRepository userRegisterRepository;

    @Override
    public void login(LoginDto dto) {
        log.info("Login function begin");
        log.info("Input email: "+dto.getEmail());
        UserRegisterEntity byEmail = userRegisterRepository.findByEmail(dto.getEmail());
        if(Objects.isNull(byEmail)){
            log.info("Can't find registered email");
        } else if (!dto.getPassword().equals(byEmail.getPassword())) {
            log.info("Incorrect password");
        }else {
            log.info(byEmail.getUsername()+" Successfully Login");
        }
    }
}
