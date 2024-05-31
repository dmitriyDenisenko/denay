package com.ksilisk.virdeanoffresourceserver.facade;

import com.ksilisk.virdeanoffresourceserver.dto.GeneratedUserCredentials;
import com.ksilisk.virdeanoffresourceserver.dto.admin.CreateAdminDTO;
import com.ksilisk.virdeanoffresourceserver.dto.dean.CreateDeanDTO;
import com.ksilisk.virdeanoffresourceserver.dto.student.CreateStudentDTO;
import com.ksilisk.virdeanoffresourceserver.dto.teacher.CreateTeacherDTO;

public interface UserCreatorFacade {
    GeneratedUserCredentials createAdmin(CreateAdminDTO createAdminDTO);

    GeneratedUserCredentials createDean(CreateDeanDTO createDeanDTO);

    GeneratedUserCredentials createStudent(CreateStudentDTO createStudentDTO);

    GeneratedUserCredentials createTeacher(CreateTeacherDTO createTeacherDTO);
}
