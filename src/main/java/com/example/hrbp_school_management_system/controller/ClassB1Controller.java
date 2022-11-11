package com.example.hrbp_school_management_system.controller;

import com.example.hrbp_school_management_system.dto.ClassB1Dto;
import com.example.hrbp_school_management_system.model.ClassB1;
import com.example.hrbp_school_management_system.service.ClassB1Service;
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
public class ClassB1Controller {

    private final ClassB1Service classB1Service;

    @RequestMapping ("/getStudentScores")
    public ResponseEntity<List<ClassB1Dto>> getStudentScores(){
        List<ClassB1Dto> studentResponseDTOS = classB1Service.retrieveStudentscore();
        return new ResponseEntity<>(studentResponseDTOS, HttpStatus.OK);
    }

    @PostMapping("/storeStudentScore")
    public ClassB1 createUser(@RequestBody ClassB1Dto classB1Dto) {
        return classB1Service.storeStudentScore(classB1Dto);

    }
}
