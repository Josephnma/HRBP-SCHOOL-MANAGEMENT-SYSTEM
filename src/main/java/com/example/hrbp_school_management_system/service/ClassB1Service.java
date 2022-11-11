package com.example.hrbp_school_management_system.service;

import com.example.hrbp_school_management_system.dto.ClassB1Dto;
import com.example.hrbp_school_management_system.model.ClassB1;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassB1Service {

    ClassB1 storeStudentScore(ClassB1Dto classB1Dto);


    List<ClassB1Dto> retrieveStudentscore();
}

