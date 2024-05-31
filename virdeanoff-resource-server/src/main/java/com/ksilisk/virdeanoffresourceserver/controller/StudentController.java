package com.ksilisk.virdeanoffresourceserver.controller;

import com.ksilisk.virdeanoffresourceserver.dto.GeneratedUserCredentials;
import com.ksilisk.virdeanoffresourceserver.dto.grade.GradeDTO;
import com.ksilisk.virdeanoffresourceserver.dto.student.CreateStudentDTO;
import com.ksilisk.virdeanoffresourceserver.dto.student.StudentDTO;
import com.ksilisk.virdeanoffresourceserver.dto.subject.SubjectDTO;
import com.ksilisk.virdeanoffresourceserver.facade.UserCreatorFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:5173/")

public class StudentController {
    private final UserCreatorFacade userCreatorFacade;

    @PostMapping
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_DEAN')")
    public GeneratedUserCredentials createStudent(@Valid @RequestBody CreateStudentDTO createStudentDTO) {
        return userCreatorFacade.createStudent(createStudentDTO);
    }

    @GetMapping
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_DEAN')")
    public List<StudentDTO> getStudents() {
        // TODO implement this
        return Collections.emptyList();
    }

    @GetMapping("/{studentId}/subject")
    public List<SubjectDTO> getSubjects(@PathVariable(name = "studentId") String studentId) {
        // TODO implement this
        return Collections.emptyList();
    }

    @GetMapping("/{studentId}/grade")
    public List<GradeDTO> getGrades(@PathVariable(name = "studentId") String studentId) {
        // TODO implement this
        return Collections.emptyList();
    }
}
