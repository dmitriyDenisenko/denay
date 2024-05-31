package com.ksilisk.virdeanoffresourceserver.credential.impl;

import com.ksilisk.virdeanoffresourceserver.credential.LoginGenerator;
import com.ksilisk.virdeanoffresourceserver.credential.PasswordGenerator;
import com.ksilisk.virdeanoffresourceserver.credential.UserCredentialsGenerator;
import com.ksilisk.virdeanoffresourceserver.dto.GeneratedUserCredentials;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserCredentialsGeneratorImpl implements UserCredentialsGenerator {
    private final LoginGenerator loginGenerator;
    private final PasswordGenerator passwordGenerator;

    @Override
    public GeneratedUserCredentials generate(String email, String phone) {
        String login = loginGenerator.generate(email, phone);
        String password = passwordGenerator.generate(email, phone);
        return new GeneratedUserCredentials(login, password);
    }
}
