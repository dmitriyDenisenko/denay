package com.ksilisk.virdeanoffauthserver.controller;


import com.ksilisk.virdeanoff.common.dto.CreateUserDTO;
import com.ksilisk.virdeanoffauthserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:5173/")

public class UserController {
    private final UserService userService;

    @PostMapping
    private void createUser(@RequestBody CreateUserDTO createUserDTO) {
        userService.createUser(createUserDTO);
    }
}
