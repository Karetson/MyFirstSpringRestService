package com.sda.project.wypozyczalnia.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class  Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double summary;
}
