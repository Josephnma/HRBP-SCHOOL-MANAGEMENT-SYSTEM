package com.example.hrbp_school_management_system.controller;


import com.example.hrbp_school_management_system.dto.StudentDto;
import com.example.hrbp_school_management_system.model.Student;
import com.example.hrbp_school_management_system.service.StudentService;
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
public class StudentController {

    private final StudentService studentService;

    @RequestMapping ("/getStudentScores")
    public ResponseEntity<List<StudentDto>> getStudentScores(){
        List<StudentDto> studentResponseDTOS = studentService.retrieveStudentscore();
        return new ResponseEntity<>(studentResponseDTOS, HttpStatus.OK);
    }

    @PostMapping("/storeStudentScore")
    public Student createUser(@RequestBody StudentDto studentDto) {
        return studentService.storeStudentScore(studentDto);

    }
}
