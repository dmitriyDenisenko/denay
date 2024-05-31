package com.ksilisk.virdeanoffresourceserver.service;

import com.ksilisk.virdeanoffresourceserver.dto.student.CreateStudentDTO;
import com.ksilisk.virdeanoffresourceserver.entity.Student;

public interface StudentService {
    Student create(CreateStudentDTO createStudentDTO, String studentLogin);
}
