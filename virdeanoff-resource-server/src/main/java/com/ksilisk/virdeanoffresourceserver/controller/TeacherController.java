package com.ksilisk.virdeanoffresourceserver.controller;

import com.ksilisk.virdeanoffresourceserver.dto.GeneratedUserCredentials;
import com.ksilisk.virdeanoffresourceserver.dto.teacher.CreateTeacherDTO;
import com.ksilisk.virdeanoffresourceserver.facade.UserCreatorFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:5173/")

public class TeacherController {
    private final UserCreatorFacade userCreatorFacade;

    @PostMapping
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_DEAN')")
    public GeneratedUserCredentials createdTeacher(@Valid @RequestBody CreateTeacherDTO createTeacherDTO) {
        return userCreatorFacade.createTeacher(createTeacherDTO);
    }
}
