package com.example.hrbp_school_management_system.service;

import com.example.hrbp_school_management_system.dto.ClassA2Dto;
import com.example.hrbp_school_management_system.model.ClassA2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassA2Service {

    ClassA2 storeStudentScore(ClassA2Dto classA2Dto);


    List<ClassA2Dto> retrieveStudentscore();
}
