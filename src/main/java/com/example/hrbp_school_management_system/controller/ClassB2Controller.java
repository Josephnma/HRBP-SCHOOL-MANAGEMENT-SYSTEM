package com.example.hrbp_school_management_system.controller;

import com.example.hrbp_school_management_system.dto.ClassB2Dto;
import com.example.hrbp_school_management_system.model.ClassB2;
import com.example.hrbp_school_management_system.service.ClassB2Service;
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
public class ClassB2Controller {

    private final ClassB2Service classB2Service;

    @RequestMapping ("/getStudentScores")
    public ResponseEntity<List<ClassB2Dto>> getStudentScores(){
        List<ClassB2Dto> studentResponseDTOS = classB2Service.retrieveStudentscore();
        return new ResponseEntity<>(studentResponseDTOS, HttpStatus.OK);
    }

    @PostMapping("/storeStudentScore")
    public ClassB2 createUser(@RequestBody ClassB2Dto classB2Dto) {
        return classB2Service.storeStudentScore(classB2Dto);

    }
}
