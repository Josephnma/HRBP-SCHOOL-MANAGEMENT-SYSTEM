//package com.example.hrbp_school_management_system.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import javax.validation.constraints.Size;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class StudentScores extends Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @Size(min = 0, max = 100)
//    private double score;
//
//        @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE })
//        private Student student;
//
//
//}
