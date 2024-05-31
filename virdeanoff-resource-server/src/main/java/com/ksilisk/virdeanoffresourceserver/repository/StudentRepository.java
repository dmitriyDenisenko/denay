package com.ksilisk.virdeanoffresourceserver.repository;

import com.ksilisk.virdeanoffresourceserver.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
