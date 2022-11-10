package com.example.hrbp_school_management_system.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private String student_name;
    private String subject;
    private String student_class;
    private String score;
    private String term;
}
