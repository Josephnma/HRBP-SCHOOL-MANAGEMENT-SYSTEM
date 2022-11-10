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
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String Maths;

    @Column(nullable = false)
    private String English;

    @Column(nullable = false, unique = true)
    private String Writing;

    @Column(nullable = false)
    private String General_Science;

    @Column(nullable = false, unique = true)
    private String Economics;

    @Column(nullable = false)
    private String Arts;

    @Column(nullable = false, unique = true)
    private String Biology;

    @Column(nullable = false)
    private String Physics;

    @Column(nullable = false)
    private String Chemistry;

    @Column(nullable = false)
    private String Geography;

    @Column(nullable = false, unique = true)
    private String Painting;

    @Column(nullable = false)
    private String Drawing;

    @Column(nullable = false)
    private String Music;

    @Column(nullable = false)
    private String Accounting;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE })
      private Student student;
}
