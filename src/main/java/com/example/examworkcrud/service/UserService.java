package com.example.examworkcrud.service;

import com.example.examworkcrud.dto.RegisterDto;
import com.example.examworkcrud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void register(RegisterDto registerDto){


    }
}
