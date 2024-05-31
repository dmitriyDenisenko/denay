package com.ksilisk.virdeanoffresourceserver.dto.group;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record CreateGroupDTO(
        @NotBlank String name,
        @Min(1900) @Max(3000) int year
) {
}
