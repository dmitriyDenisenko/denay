package com.ksilisk.virdeanoffresourceserver.service;

import com.ksilisk.virdeanoffresourceserver.dto.dean.CreateDeanDTO;
import com.ksilisk.virdeanoffresourceserver.entity.Dean;

public interface DeanService {
    Dean create(CreateDeanDTO createDeanDTO, String deanLogin);
}
