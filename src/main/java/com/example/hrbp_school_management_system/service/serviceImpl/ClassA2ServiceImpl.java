package com.example.hrbp_school_management_system.service.serviceImpl;

import com.example.hrbp_school_management_system.dto.ClassA2Dto;
import com.example.hrbp_school_management_system.model.ClassA2;
import com.example.hrbp_school_management_system.repository.ClassA2Repository;
import com.example.hrbp_school_management_system.service.ClassA2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassA2ServiceImpl implements ClassA2Service {

    private final ClassA2Repository classA2Repository;


    @Override
    public ClassA2 storeStudentScore(ClassA2Dto classA2Dto) {

        ClassA2 student = ClassA2.builder()
                .student_name(classA2Dto.getStudent_name())
                .term(classA2Dto.getTerm())
                .English(classA2Dto.getEnglish())
                .Maths(classA2Dto.getMaths())
                .Arts(classA2Dto.getArts())
                .Economics(classA2Dto.getEconomics())
                .build();

        return classA2Repository.save(student);
    }

    @Override
    public List<ClassA2Dto> retrieveStudentscore() {
        List<ClassA2> studentScore = classA2Repository.findAll();
        List<ClassA2Dto> studentDtos = new ArrayList<>();
        for (ClassA2 student: studentScore){
            ClassA2Dto studentResponseDto = new ClassA2Dto();
            studentResponseDto.setStudent_name(student.getStudent_name());
            studentResponseDto.setEnglish(student.getEnglish());
            studentResponseDto.setMaths(student.getMaths());
            studentResponseDto.setArts(student.getArts());
            studentResponseDto.setEconomics(student.getEconomics());
            studentResponseDto.setTerm(student.getTerm());
            studentDtos.add(studentResponseDto);

        }
        return studentDtos;
    }
}
