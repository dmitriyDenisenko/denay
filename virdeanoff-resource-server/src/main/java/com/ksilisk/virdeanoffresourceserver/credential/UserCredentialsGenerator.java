package com.ksilisk.virdeanoffresourceserver.credential;

import com.ksilisk.virdeanoffresourceserver.dto.GeneratedUserCredentials;

public interface UserCredentialsGenerator {
    GeneratedUserCredentials generate(String email, String phone);
}
