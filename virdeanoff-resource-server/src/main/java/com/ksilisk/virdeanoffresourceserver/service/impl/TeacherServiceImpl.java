package com.ksilisk.virdeanoffresourceserver.service.impl;

import com.ksilisk.virdeanoffresourceserver.dto.teacher.CreateTeacherDTO;
import com.ksilisk.virdeanoffresourceserver.entity.Teacher;
import com.ksilisk.virdeanoffresourceserver.repository.TeacherRepository;
import com.ksilisk.virdeanoffresourceserver.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;

    @Override
    public Teacher create(CreateTeacherDTO createTeacherDTO, String teacherLogin) {
        Teacher newTeacher = Teacher.builder()
                .phone(createTeacherDTO.phone())
                .department(createTeacherDTO.department())
                .name(createTeacherDTO.name())
                .surname(createTeacherDTO.surname())
                .lastname(createTeacherDTO.lastname())
                .email(createTeacherDTO.email())
                .teacherLogin(teacherLogin)
                .build();
        return teacherRepository.save(newTeacher);
    }
}
