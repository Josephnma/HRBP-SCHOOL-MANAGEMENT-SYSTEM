package com.example.hrbp_school_management_system.service.serviceImpl;

import com.example.hrbp_school_management_system.dto.ClassA1Dto;
import com.example.hrbp_school_management_system.model.ClassA1;
import com.example.hrbp_school_management_system.repository.ClassA1Repository;
import com.example.hrbp_school_management_system.service.ClassA1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassA1ServiceImpl implements ClassA1Service {

    private final ClassA1Repository classA1Repository;


    @Override
    public ClassA1 storeStudentScore(ClassA1Dto classA1Dto) {

        ClassA1 student = ClassA1.builder()
                .student_name(classA1Dto.getStudent_name())
                .term(classA1Dto.getTerm())
                .English(classA1Dto.getEnglish())
                .Maths(classA1Dto.getMaths())
                .Writing(classA1Dto.getWriting())
                .GeneralScience(classA1Dto.getGeneralScience())
                .build();

        return classA1Repository.save(student);
    }


    @Override
    public List<ClassA1Dto> retrieveStudentscore() {
        List<ClassA1> studentScore = classA1Repository.findAll();
        List<ClassA1Dto> studentDtos = new ArrayList<>();
        for (ClassA1 student: studentScore){
            ClassA1Dto studentResponseDto = new ClassA1Dto();
            studentResponseDto.setStudent_name(student.getStudent_name());
            studentResponseDto.setEnglish(student.getEnglish());
            studentResponseDto.setMaths(student.getMaths());
            studentResponseDto.setGeneralScience(student.getGeneralScience());
            studentResponseDto.setWriting(student.getWriting());
            studentResponseDto.setTerm(student.getTerm());
            studentDtos.add(studentResponseDto);

        }
        return studentDtos;
    }
}
