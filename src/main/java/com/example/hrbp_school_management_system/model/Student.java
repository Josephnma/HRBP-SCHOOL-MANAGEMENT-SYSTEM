package com.example.hrbp_school_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String student_name;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private String student_class;

    @Column(nullable = false)
    @Size(min = 0, max = 100)
    private String score;

    @Column(nullable = false)
    private String term;

}
