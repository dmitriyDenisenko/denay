package com.ksilisk.virdeanoffresourceserver.controller;

import com.ksilisk.virdeanoffresourceserver.dto.GeneratedUserCredentials;
import com.ksilisk.virdeanoffresourceserver.dto.admin.CreateAdminDTO;
import com.ksilisk.virdeanoffresourceserver.facade.UserCreatorFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:5173/")
public class AdminController {
    private final UserCreatorFacade userCreatorFacade;

    @PostMapping
//    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN')")
    public GeneratedUserCredentials createAdmin(@Valid @RequestBody CreateAdminDTO createAdminDTO) {
        return userCreatorFacade.createAdmin(createAdminDTO);
    }
}
