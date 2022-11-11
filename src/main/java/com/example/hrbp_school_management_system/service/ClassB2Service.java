package com.example.hrbp_school_management_system.service;

import com.example.hrbp_school_management_system.dto.ClassB2Dto;
import com.example.hrbp_school_management_system.model.ClassB2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassB2Service {

    ClassB2 storeStudentScore(ClassB2Dto classB2Dto);


    List<ClassB2Dto> retrieveStudentscore();
}

