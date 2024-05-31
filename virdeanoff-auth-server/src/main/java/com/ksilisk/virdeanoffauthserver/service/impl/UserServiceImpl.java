package com.ksilisk.virdeanoffauthserver.service.impl;

import com.ksilisk.virdeanoff.common.dto.CreateUserDTO;
import com.ksilisk.virdeanoff.common.payload.Role;
import com.ksilisk.virdeanoffauthserver.entity.User;
import com.ksilisk.virdeanoffauthserver.repository.UserRepository;
import com.ksilisk.virdeanoffauthserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Override
    public void createUser(CreateUserDTO createUserDTO) {
        String encodedPassword = passwordEncoder.encode(createUserDTO.password());
        User user = new User(createUserDTO.username(), encodedPassword, Role.valueOf(createUserDTO.role()));
        userRepository.save(user);
    }
}
