package com.ksilisk.virdeanoffresourceserver.dto.student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateStudentDTO(
        @NotBlank String name,
        @NotBlank String surname,
        String lastname,
        @NotBlank String phone,
        @Email String email,
        @NotBlank String group
) {
}
