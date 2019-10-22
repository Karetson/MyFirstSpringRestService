package com.sda.project.wypozyczalnia.model;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Department> departments = new ArrayList<>();

    private String name;
    private String domain;
    private String contactAddress;
    private String owner;
    private String logo;
}
