package com.example.hrbp_school_management_system.service.serviceImpl;

import com.example.hrbp_school_management_system.dto.ClassB1Dto;
import com.example.hrbp_school_management_system.model.ClassB1;
import com.example.hrbp_school_management_system.repository.ClassB1Repository;
import com.example.hrbp_school_management_system.service.ClassB1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassB1ServiceImpl implements ClassB1Service {

    private final ClassB1Repository classB1Repository;


    @Override
    public ClassB1 storeStudentScore(ClassB1Dto classB1Dto) {

        ClassB1 student = ClassB1.builder()
                .student_name(classB1Dto.getStudent_name())
                .term(classB1Dto.getTerm())
                .English(classB1Dto.getEnglish())
                .Maths(classB1Dto.getMaths())
                .Biology(classB1Dto.getBiology())
                .Chemistry(classB1Dto.getChemistry())
                .Physics(classB1Dto.getPhysics())
                .Geography(classB1Dto.getGeography())

                .build();

        return classB1Repository.save(student);
    }



    @Override
    public List<ClassB1Dto> retrieveStudentscore() {
        List<ClassB1> studentScore = classB1Repository.findAll();
        List<ClassB1Dto> studentDtos = new ArrayList<>();
        for (ClassB1 student: studentScore){
            ClassB1Dto studentResponseDto = new ClassB1Dto();
            studentResponseDto.setStudent_name(student.getStudent_name());
            studentResponseDto.setEnglish(student.getEnglish());
            studentResponseDto.setMaths(student.getMaths());
            studentResponseDto.setBiology(student.getBiology());
            studentResponseDto.setChemistry(student.getChemistry());
            studentResponseDto.setGeography(student.getGeography());
            studentResponseDto.setPhysics(student.getPhysics());
            studentResponseDto.setTerm(student.getTerm());


            studentDtos.add(studentResponseDto);

        }
        return studentDtos;
    }
}
