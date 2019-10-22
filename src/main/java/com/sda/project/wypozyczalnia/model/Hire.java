package com.sda.project.wypozyczalnia.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Hire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Employee employee;

    @OneToOne
    private Reservation reservation;

    private Date date;
    private String comments;
}
