package com.ksilisk.virdeanoffresourceserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@Entity(name = "deans")
@NoArgsConstructor
@AllArgsConstructor
public class Dean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deanId;

    private String deanLogin;

    private String name;

    private String surname;

    private String lastname;

    private String phone;

    private String email;
}
