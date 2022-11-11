package com.example.hrbp_school_management_system.controller;

import com.example.hrbp_school_management_system.dto.ClassA1Dto;
import com.example.hrbp_school_management_system.model.ClassA1;
import com.example.hrbp_school_management_system.service.ClassA1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ClassA1Controller {

    private final ClassA1Service classA1Service;

    @RequestMapping ("/getStudentScores")
    public ResponseEntity<List<ClassA1Dto>> getStudentScores(){
        List<ClassA1Dto> studentResponseDTOS = classA1Service.retrieveStudentscore();
        return new ResponseEntity<>(studentResponseDTOS, HttpStatus.OK);
    }

    @PostMapping("/storeStudentScore")
    public ClassA1 createUser(@RequestBody ClassA1Dto classA1Dto) {
        return classA1Service.storeStudentScore(classA1Dto);

    }
}
