package com.sda.project.wypozyczalnia.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private double engine;
    private int productionYear;
    private String color;
    private double mileage;
    private double price;

    @OneToOne
    private Equipment equipment;

    @ManyToOne
    private Reservation reservation;
}
