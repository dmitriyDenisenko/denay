package com.ksilisk.virdeanoffresourceserver.service.impl;

import com.ksilisk.virdeanoffresourceserver.dto.student.CreateStudentDTO;
import com.ksilisk.virdeanoffresourceserver.entity.Group;
import com.ksilisk.virdeanoffresourceserver.entity.Student;
import com.ksilisk.virdeanoffresourceserver.repository.GroupRepository;
import com.ksilisk.virdeanoffresourceserver.repository.StudentRepository;
import com.ksilisk.virdeanoffresourceserver.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    @Override
    @Transactional
    public Student create(CreateStudentDTO createStudentDTO, String studentLogin) {
        Group group = groupRepository.findGroupByName(createStudentDTO.group())
                .orElseThrow(IllegalArgumentException::new);
        Student newStudent = Student.builder()
                .name(createStudentDTO.name())
                .email(createStudentDTO.email())
                .surname(createStudentDTO.surname())
                .studentLogin(studentLogin)
                .phone(createStudentDTO.phone())
                .lastname(createStudentDTO.lastname())
                .group(group)
                .build();
        return studentRepository.save(newStudent);
    }
}
