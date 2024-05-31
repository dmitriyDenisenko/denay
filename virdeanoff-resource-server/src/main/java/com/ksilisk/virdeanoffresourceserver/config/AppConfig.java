package com.ksilisk.virdeanoffresourceserver.config;

import com.ksilisk.virdeanoffresourceserver.credential.LoginGenerator;
import com.ksilisk.virdeanoffresourceserver.credential.PasswordGenerator;
import com.ksilisk.virdeanoffresourceserver.credential.impl.LoginGeneratorImpl;
import com.ksilisk.virdeanoffresourceserver.credential.impl.PasswordGeneratorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

@Configuration
public class AppConfig {
    @Bean
    public PasswordGenerator passwordGenerator() {
        return new PasswordGeneratorImpl(PasswordEncoderFactories.createDelegatingPasswordEncoder());
    }

    @Bean
    public LoginGenerator loginGenerator() {
        return new LoginGeneratorImpl();
    }
}
