package com.ksilisk.virdeanoffresourceserver.dto.student;

public record StudentDTO(
        Long studentId,
        String name,
        String surname,
        String lastname,
        String phone,
        String email,
        String group) {
}