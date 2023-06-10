package com.example.examworkcrud.service.impl;

import com.example.examworkcrud.dto.RegisterDto;
import com.example.examworkcrud.entity.UserRegisterEntity;
import com.example.examworkcrud.mapper.RegisterMapper;
import com.example.examworkcrud.repository.UserRegisterRepository;
import com.example.examworkcrud.service.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegisterServiceImpl implements RegisterService {
    private final UserRegisterRepository userRegisterRepository;
    private final RegisterMapper mapper;
    @Override
    public void register(RegisterDto registerDto) {
        log.info("Register function begin");
        UserRegisterEntity byEmail = userRegisterRepository.findByEmail(registerDto.getEmail());
        UserRegisterEntity byUsername = userRegisterRepository.findByUsername(registerDto.getUsername());
        if(!Objects.isNull(byEmail)){
            log.info("This email already registered");
        } else if (!Objects.isNull(byUsername)) {
            log.info("This username already used");
        }else{
            UserRegisterEntity userRegisterEntity = mapper.dtoToEntity(registerDto);
            userRegisterRepository.save(userRegisterEntity);
        }

    }
}
