package com.ksilisk.virdeanoffresourceserver.service.impl;

import com.ksilisk.virdeanoffresourceserver.dto.admin.CreateAdminDTO;
import com.ksilisk.virdeanoffresourceserver.entity.Admin;
import com.ksilisk.virdeanoffresourceserver.repository.AdminRepository;
import com.ksilisk.virdeanoffresourceserver.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;

    @Override
    public Admin create(CreateAdminDTO createAdminDTO, String adminLogin) {
        Admin newAdmin = Admin.builder()
                .phone(createAdminDTO.phone())
                .surname(createAdminDTO.surname())
                .name(createAdminDTO.name())
                .email(createAdminDTO.email())
                .adminLogin(adminLogin)
                .lastname(createAdminDTO.lastname())
                .build();
        return adminRepository.save(newAdmin);
    }
}
