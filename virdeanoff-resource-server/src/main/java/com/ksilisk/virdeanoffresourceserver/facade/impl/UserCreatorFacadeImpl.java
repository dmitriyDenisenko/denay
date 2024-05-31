package com.ksilisk.virdeanoffresourceserver.facade.impl;

import com.ksilisk.virdeanoff.common.dto.CreateUserDTO;
import com.ksilisk.virdeanoff.common.payload.Role;
import com.ksilisk.virdeanoffresourceserver.credential.UserCredentialsGenerator;
import com.ksilisk.virdeanoffresourceserver.dto.GeneratedUserCredentials;
import com.ksilisk.virdeanoffresourceserver.dto.admin.CreateAdminDTO;
import com.ksilisk.virdeanoffresourceserver.dto.dean.CreateDeanDTO;
import com.ksilisk.virdeanoffresourceserver.dto.student.CreateStudentDTO;
import com.ksilisk.virdeanoffresourceserver.dto.teacher.CreateTeacherDTO;
import com.ksilisk.virdeanoffresourceserver.facade.UserCreatorFacade;
import com.ksilisk.virdeanoffresourceserver.feign.AuthClient;
import com.ksilisk.virdeanoffresourceserver.service.AdminService;
import com.ksilisk.virdeanoffresourceserver.service.DeanService;
import com.ksilisk.virdeanoffresourceserver.service.StudentService;
import com.ksilisk.virdeanoffresourceserver.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCreatorFacadeImpl implements UserCreatorFacade {
    private final AuthClient authClient;
    private final AdminService adminService;
    private final DeanService deanService;
    private final StudentService studentService;
    private final TeacherService teacherService;
    private final UserCredentialsGenerator userCredentialsGenerator;

    @Override
    public GeneratedUserCredentials createAdmin(CreateAdminDTO createAdminDTO) {
        GeneratedUserCredentials userCredentials = userCredentialsGenerator.generate(createAdminDTO.email(), createAdminDTO.phone());
        CreateUserDTO createUserDTO = new CreateUserDTO(userCredentials.username(), userCredentials.password(), Role.ADMIN.name());
        authClient.creatUser(createUserDTO);
        adminService.create(createAdminDTO, userCredentials.username());
        return userCredentials;
    }

    @Override
    public GeneratedUserCredentials createDean(CreateDeanDTO createDeanDTO) {
        GeneratedUserCredentials userCredentials = userCredentialsGenerator.generate(createDeanDTO.email(), createDeanDTO.phone());
        CreateUserDTO createUserDTO = new CreateUserDTO(userCredentials.username(), userCredentials.password(), Role.DEAN.name());
        authClient.creatUser(createUserDTO);
        deanService.create(createDeanDTO, userCredentials.username());
        return userCredentials;
    }

    @Override
    public GeneratedUserCredentials createStudent(CreateStudentDTO createStudentDTO) {
        GeneratedUserCredentials userCredentials = userCredentialsGenerator.generate(createStudentDTO.email(), createStudentDTO.phone());
        CreateUserDTO createUserDTO = new CreateUserDTO(userCredentials.username(), userCredentials.password(), Role.STUDENT.name());
        System.out.println(userCredentials.password());
        System.out.println("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        authClient.creatUser(createUserDTO);
        studentService.create(createStudentDTO, userCredentials.username());
        return userCredentials;
    }

    @Override
    public GeneratedUserCredentials createTeacher(CreateTeacherDTO createTeacherDTO) {
        GeneratedUserCredentials userCredentials = userCredentialsGenerator.generate(createTeacherDTO.email(), createTeacherDTO.phone());
        CreateUserDTO createUserDTO = new CreateUserDTO(userCredentials.username(), userCredentials.password(), Role.TEACHER.name());
        authClient.creatUser(createUserDTO);
        teacherService.create(createTeacherDTO, userCredentials.username());
        return userCredentials;
    }
}
