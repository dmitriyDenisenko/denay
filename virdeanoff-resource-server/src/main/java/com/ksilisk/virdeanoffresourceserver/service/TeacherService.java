package com.ksilisk.virdeanoffresourceserver.service;

import com.ksilisk.virdeanoffresourceserver.dto.teacher.CreateTeacherDTO;
import com.ksilisk.virdeanoffresourceserver.entity.Teacher;

public interface TeacherService {
    Teacher create(CreateTeacherDTO createTeacherDTO, String teacherLogin);
}
