package com.sda.project.wypozyczalnia.model;

<<<<<<< HEAD

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String surname;
    private String email;
    private String dlsn;
    private String password;

    public User() {
    }

    public User(String name, String surname, String email, String dlsn, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dlsn = dlsn;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDlsn() {
        return dlsn;
    }

    public void setDlsn(String dlsn) {
        this.dlsn = dlsn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
=======
public class User {

>>>>>>> a4035494f1e1312394c56583b4cdbcd275e87b24
}
