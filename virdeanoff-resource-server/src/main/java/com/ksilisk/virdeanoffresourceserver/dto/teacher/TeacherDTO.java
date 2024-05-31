package com.ksilisk.virdeanoffresourceserver.dto.teacher;

public record TeacherDTO(
        Long teacherId,
        String name,
        String surname,
        String lastname,
        String phone,
        String email) {
}