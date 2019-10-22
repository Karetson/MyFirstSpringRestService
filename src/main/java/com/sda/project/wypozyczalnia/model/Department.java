package com.sda.project.wypozyczalnia.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Rental rental;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;

    private String availableCarList;

    @OneToMany
    private List<Employee> employees;
}
