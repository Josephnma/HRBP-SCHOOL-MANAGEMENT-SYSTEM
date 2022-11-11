package com.example.hrbp_school_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ClassA2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String student_name;

    @Column(nullable = false)
    private String term;

    @Column(nullable = false)
    private String Maths;

    @Column(nullable = false)
    private String English;

    @Column(nullable = false)
    private String Arts;

    @Column(nullable = false)
    private String Economics;
}
