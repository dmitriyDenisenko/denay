package com.ksilisk.virdeanoffresourceserver.dto.admin;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateAdminDTO(
        @NotBlank String name,
        @NotBlank String surname,
        String lastname,
        @NotBlank String phone,
        @Email String email
) {
}
