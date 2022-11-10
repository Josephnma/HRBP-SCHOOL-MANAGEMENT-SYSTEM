package com.example.hrbp_school_management_system.serviceImpl;

import com.example.hrbp_school_management_system.dto.StudentDto;
import com.example.hrbp_school_management_system.model.Student;
import com.example.hrbp_school_management_system.repository.StudentRepository;
import com.example.hrbp_school_management_system.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public Student storeStudentScore(StudentDto studentDto) {

        Student student = Student.builder()
                .student_name(studentDto.getStudent_name())
                .student_class(studentDto.getStudent_class())
                .term(studentDto.getTerm())
                .subject(studentDto.getSubject())
                .score(studentDto.getScore())
                .build();

        return studentRepository.save(student);
    }


    @Override
    public List<StudentDto> retrieveStudentscore() {
        List<Student> studentScore = studentRepository.findAll();
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student student: studentScore){
            StudentDto studentResponseDto = new StudentDto();
            studentResponseDto.setStudent_name(student.getStudent_name());
            studentResponseDto.setStudent_class(student.getStudent_class());
            studentResponseDto.setSubject(student.getSubject());
            studentResponseDto.setTerm(student.getTerm());
            studentResponseDto.setScore(student.getScore());

            studentDtos.add(studentResponseDto);

        }
        return studentDtos;
    }
}
