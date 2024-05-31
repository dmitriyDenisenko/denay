package com.ksilisk.virdeanoffresourceserver.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity(name = "students")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String studentLogin;

    private String name;

    private String surname;

    private String lastname;

    private String email;

    private String phone;

    @OneToOne
    @JoinColumn(name = "group_id")
    private Group group;
}
