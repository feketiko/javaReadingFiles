package com.example.domain;

import javax.persistence.*;


@Entity
@Table(name="urs1")
public class Files {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private String first_name;
    private String city;
    private String state;
    private String email;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Files(String first_name, String city, String state, String email) {
        this.first_name = first_name;
        this.city = city;
        this.state = state;
        this.email = email;
    }

    public Files (){};

}
