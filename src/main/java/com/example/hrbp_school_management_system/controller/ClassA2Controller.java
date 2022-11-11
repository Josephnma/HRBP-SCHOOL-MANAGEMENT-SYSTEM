package com.example.hrbp_school_management_system.controller;

import com.example.hrbp_school_management_system.dto.ClassA2Dto;
import com.example.hrbp_school_management_system.model.ClassA2;
import com.example.hrbp_school_management_system.service.ClassA2Service;
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
public class ClassA2Controller {

    private final ClassA2Service classA2Service;

    @RequestMapping ("/getStudentScores")
    public ResponseEntity<List<ClassA2Dto>> getStudentScores(){
        List<ClassA2Dto> studentResponseDTOS = classA2Service.retrieveStudentscore();
        return new ResponseEntity<>(studentResponseDTOS, HttpStatus.OK);
    }

    @PostMapping("/storeStudentScore")
    public ClassA2 createUser(@RequestBody ClassA2Dto classA2Dto) {
        return classA2Service.storeStudentScore(classA2Dto);

    }
}
