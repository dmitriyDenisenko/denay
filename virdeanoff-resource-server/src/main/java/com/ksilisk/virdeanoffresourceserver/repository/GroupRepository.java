package com.ksilisk.virdeanoffresourceserver.repository;

import com.ksilisk.virdeanoffresourceserver.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Optional<Group> findGroupByName(String name);
}
