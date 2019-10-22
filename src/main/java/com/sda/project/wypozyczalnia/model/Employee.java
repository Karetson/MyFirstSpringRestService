package com.sda.project.wypozyczalnia.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;


    @ManyToOne
    private Department department;
}
