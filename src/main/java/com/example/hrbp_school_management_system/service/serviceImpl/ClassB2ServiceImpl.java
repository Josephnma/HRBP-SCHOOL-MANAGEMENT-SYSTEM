package com.example.hrbp_school_management_system.service.serviceImpl;

import com.example.hrbp_school_management_system.dto.ClassB2Dto;
import com.example.hrbp_school_management_system.model.ClassB2;
import com.example.hrbp_school_management_system.repository.ClassB2Repository;
import com.example.hrbp_school_management_system.service.ClassB2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassB2ServiceImpl implements ClassB2Service {

    private final ClassB2Repository classB2Repository;


    @Override
    public ClassB2 storeStudentScore(ClassB2Dto classB2Dto) {

        ClassB2 student = ClassB2.builder()
                .student_name(classB2Dto.getStudent_name())
                .term(classB2Dto.getTerm())
                .Drawing(classB2Dto.getDrawing())
                .Accounting(classB2Dto.getAccounting())
                .English(classB2Dto.getEnglish())
                .Maths(classB2Dto.getMaths())
                .Painting(classB2Dto.getPainting())
                .Music(classB2Dto.getMusic())
                .build();

        return classB2Repository.save(student);
    }



    @Override
    public List<ClassB2Dto> retrieveStudentscore() {
        List<ClassB2> studentScore = classB2Repository.findAll();
        List<ClassB2Dto> studentDtos = new ArrayList<>();
        for (ClassB2 student: studentScore){
            ClassB2Dto studentResponseDto = new ClassB2Dto();
            studentResponseDto.setStudent_name(student.getStudent_name());
            studentResponseDto.setAccounting(student.getAccounting());
            studentResponseDto.setDrawing(student.getDrawing());
            studentResponseDto.setEnglish(student.getEnglish());
            studentResponseDto.setMaths(student.getMaths());
            studentResponseDto.setPainting(student.getPainting());
            studentResponseDto.setMusic(student.getMusic());
            studentResponseDto.setTerm(student.getTerm());


            studentDtos.add(studentResponseDto);

        }
        return studentDtos;
    }
}
