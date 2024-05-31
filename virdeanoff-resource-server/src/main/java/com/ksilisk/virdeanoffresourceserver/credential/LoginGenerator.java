package com.ksilisk.virdeanoffresourceserver.credential;

public interface LoginGenerator {
    String generate(String email, String phone);
}
