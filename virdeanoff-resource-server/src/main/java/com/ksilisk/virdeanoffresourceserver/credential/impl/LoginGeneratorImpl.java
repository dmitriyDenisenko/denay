package com.ksilisk.virdeanoffresourceserver.credential.impl;

import com.ksilisk.virdeanoffresourceserver.credential.LoginGenerator;

public class LoginGeneratorImpl implements LoginGenerator {
    @Override
    public String generate(String email, String phone) {
        String loginSuffix = phone.substring(phone.length() - 4);
        String loginPrefix = email.split("@")[0];
        return loginPrefix + "@" + loginSuffix;
    }
}
