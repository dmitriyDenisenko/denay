package com.ksilisk.virdeanoffauthserver.entity;

import com.ksilisk.virdeanoff.common.payload.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userLogin;
    private String userPassword;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String userLogin, String userPassword, Role role) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.role = role;
    }
}
