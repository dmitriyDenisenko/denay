package com.ksilisk.virdeanoffresourceserver.service.impl;

import com.ksilisk.virdeanoffresourceserver.dto.dean.CreateDeanDTO;
import com.ksilisk.virdeanoffresourceserver.entity.Dean;
import com.ksilisk.virdeanoffresourceserver.repository.DeanRepository;
import com.ksilisk.virdeanoffresourceserver.service.DeanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeanServiceImpl implements DeanService {
    private final DeanRepository deanRepository;

    @Override
    public Dean create(CreateDeanDTO createDeanDTO, String deanLogin) {
        Dean newDean = Dean.builder()
                .name(createDeanDTO.name())
                .surname(createDeanDTO.surname())
                .phone(createDeanDTO.phone())
                .email(createDeanDTO.email())
                .lastname(createDeanDTO.lastname())
                .deanLogin(deanLogin)
                .build();
        return deanRepository.save(newDean);
    }
}
