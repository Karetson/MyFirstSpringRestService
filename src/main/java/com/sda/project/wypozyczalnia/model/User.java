package com.sda.project.wypozyczalnia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Reservation> reservation = new ArrayList<>();

    @Size(max = 30)
    private String name;

    private String surname;
    private String dlsn;

    @Email
    private String email;

    @NotBlank(message = "Podaj login")
    private String login;

    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotBlank(message = "*Please provide your password")
    private String password;

    @JsonIgnore
    @ManyToMany(mappedBy = "participants")
    List<Event> events;

    @JsonIgnore
    private int active;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}
