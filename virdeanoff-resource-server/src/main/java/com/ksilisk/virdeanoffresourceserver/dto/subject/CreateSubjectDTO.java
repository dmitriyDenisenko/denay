package com.ksilisk.virdeanoffresourceserver.dto.subject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateSubjectDTO(
        @NotBlank String name,
        @NotBlank String groupName,
        @Email String teacherEmail
) {
}
