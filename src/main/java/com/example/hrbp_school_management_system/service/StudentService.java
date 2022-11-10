package com.example.hrbp_school_management_system.service;

import com.example.hrbp_school_management_system.dto.StudentDto;
import com.example.hrbp_school_management_system.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student storeStudentScore(StudentDto studentDto);


    List<StudentDto> retrieveStudentscore();
}
