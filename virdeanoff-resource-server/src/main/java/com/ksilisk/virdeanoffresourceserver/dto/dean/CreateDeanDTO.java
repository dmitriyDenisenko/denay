package com.ksilisk.virdeanoffresourceserver.dto.dean;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateDeanDTO(
        @NotBlank String name,
        @NotBlank String surname,
        String lastname,
        @NotBlank String phone,
        @Email String email
) {
}
