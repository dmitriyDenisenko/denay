package com.ksilisk.virdeanoffresourceserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@Entity(name = "grade_types")
@NoArgsConstructor
@AllArgsConstructor
public class GradeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradeTypeId;

    private String type;
}
