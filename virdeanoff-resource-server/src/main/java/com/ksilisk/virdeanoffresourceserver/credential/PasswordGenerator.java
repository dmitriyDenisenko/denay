package com.ksilisk.virdeanoffresourceserver.credential;

public interface PasswordGenerator {
    String generate(String email, String phone);
}
