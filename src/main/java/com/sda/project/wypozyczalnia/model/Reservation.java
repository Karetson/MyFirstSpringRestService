package com.sda.project.wypozyczalnia.model;

import lombok.Data;
import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @OneToMany
    private List<Car> cars;

    private Date date;
    private String startReservation;
    private String endReservation;
    private String departmentRent;
    private String departmentReturn;
    private double price;
}
