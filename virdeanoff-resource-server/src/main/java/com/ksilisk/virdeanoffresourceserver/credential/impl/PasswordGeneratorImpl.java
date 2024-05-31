package com.ksilisk.virdeanoffresourceserver.credential.impl;

import com.ksilisk.virdeanoffresourceserver.credential.PasswordGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Base64;

@RequiredArgsConstructor
public class PasswordGeneratorImpl implements PasswordGenerator {
    private static final int PASSWORD_LENGTH = 8;

    private final PasswordEncoder passwordEncoder;

    @Override
    public String generate(String email, String phone) {
        byte[] bytesForEncode = (email + phone).getBytes();
        String base64Encoded = Base64.getEncoder().encodeToString(bytesForEncode);
        String encodedPassword = passwordEncoder.encode(base64Encoded);
        String encodedWithoutPrefix = encodedPassword.substring(encodedPassword.indexOf("}") + 1);
        return encodedWithoutPrefix.substring(0, Math.min(PASSWORD_LENGTH, encodedPassword.length()));
    }
}
