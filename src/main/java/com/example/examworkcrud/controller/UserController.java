package com.example.examworkcrud.controller;

import com.example.examworkcrud.dto.LoginDto;
import com.example.examworkcrud.dto.RegisterDto;
import com.example.examworkcrud.service.impl.LoginServiceImpl;
import com.example.examworkcrud.service.impl.RegisterServiceImpl;
import com.example.examworkcrud.service.impl.UpdateInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final RegisterServiceImpl registerService;
    private final LoginServiceImpl loginService;
    private final UpdateInfoServiceImpl updateInfoService;
    @PostMapping("/register")
    public void register(@RequestBody RegisterDto dto){
        registerService.register(dto);
    }

    @GetMapping("/login")
    public void login(LoginDto dto){
        loginService.login(dto);
    }
    @PatchMapping("/resetpassword/{email}")
    public void resetPassword(@RequestParam("email") String email,@RequestBody String password){
        updateInfoService.updatePassword(email,password);
    }
}
