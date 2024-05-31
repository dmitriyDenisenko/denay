package com.ksilisk.virdeanoffresourceserver.controller;

import com.ksilisk.virdeanoffresourceserver.dto.*;
import com.ksilisk.virdeanoffresourceserver.dto.dean.CreateDeanDTO;
import com.ksilisk.virdeanoffresourceserver.dto.group.CreateGroupDTO;
import com.ksilisk.virdeanoffresourceserver.dto.subject.CreateSubjectDTO;
import com.ksilisk.virdeanoffresourceserver.dto.teacher.CreateTeacherDTO;
import com.ksilisk.virdeanoffresourceserver.facade.UserCreatorFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dean")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:5173/")

public class DeanController {
    private final UserCreatorFacade userCreatorFacade;

    @PostMapping
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_DEAN')")
    public GeneratedUserCredentials createDean(@Valid @RequestBody CreateDeanDTO createDeanDTO) {
        return userCreatorFacade.createDean(createDeanDTO);
    }

    @PostMapping("/teacher")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_DEAN')")
    public GeneratedUserCredentials createTeacher(@Valid @RequestBody CreateTeacherDTO createTeacherDTO) {
        return userCreatorFacade.createTeacher(createTeacherDTO);
    }

    @PostMapping("/admin")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_DEAN')")
    public GeneratedUserCredentials createAdmin(@Valid @RequestBody CreateTeacherDTO createTeacherDTO) {
        return userCreatorFacade.createTeacher(createTeacherDTO);
    }

    @PostMapping("/group")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_DEAN')")
    public void createGroup(@Valid @RequestBody CreateGroupDTO createGroupDTO) {
        // TODO implement this
    }

    @PostMapping("/subject")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_DEAN')")
    public void createSubject(@Valid @RequestBody CreateSubjectDTO createSubjectDTO) {
        // TODO implement this
    }
}
