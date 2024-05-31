package com.ksilisk.virdeanoffresourceserver.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity(name = "subjects")
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    private String name;

    @OneToOne
    private Teacher teacher;

    @OneToOne
    private Group group;
}
