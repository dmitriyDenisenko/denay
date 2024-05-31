package com.ksilisk.virdeanoffresourceserver.feign;

import com.ksilisk.virdeanoff.common.dto.CreateUserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "authClient", url = "${virdean.auth-server-uri}")
public interface AuthClient {
    @PostMapping("/users")
    void creatUser(@RequestBody CreateUserDTO createUserDTO);
}
