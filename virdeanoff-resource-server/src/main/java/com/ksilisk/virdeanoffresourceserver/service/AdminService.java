package com.ksilisk.virdeanoffresourceserver.service;

import com.ksilisk.virdeanoffresourceserver.dto.admin.CreateAdminDTO;
import com.ksilisk.virdeanoffresourceserver.entity.Admin;

public interface AdminService {
    Admin create(CreateAdminDTO createAdminDTO, String adminLogin);
}
