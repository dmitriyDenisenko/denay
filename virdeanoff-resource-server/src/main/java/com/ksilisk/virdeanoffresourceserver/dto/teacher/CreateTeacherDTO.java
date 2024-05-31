package com.ksilisk.virdeanoffresourceserver.dto.teacher;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateTeacherDTO(
        @NotBlank String name,
        @NotBlank String surname,
        String lastname,
        @NotBlank String phone,
        @Email String email,
        @NotBlank String department
) {
}
