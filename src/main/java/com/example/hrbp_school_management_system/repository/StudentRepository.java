package com.example.hrbp_school_management_system.repository;

import com.example.hrbp_school_management_system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
