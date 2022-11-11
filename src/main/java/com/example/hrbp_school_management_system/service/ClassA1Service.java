package com.example.hrbp_school_management_system.service;

import com.example.hrbp_school_management_system.dto.ClassA1Dto;
import com.example.hrbp_school_management_system.model.ClassA1;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassA1Service {

    ClassA1 storeStudentScore(ClassA1Dto classA1Dto);


    List<ClassA1Dto> retrieveStudentscore();
}

