package com.example.demo.api;

import java.util.Date;

public class ClientResponse {
    private Long id;
    private String name;
    private String surname;
    private Long age;
    private Date birthDate;
    private Date probableDeathDate;

    public ClientResponse() {
    }

    public ClientResponse(Long id, String name, String surname, Long age, Date birthDate, Date probableDeathDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthDate = birthDate;
        this.probableDeathDate = probableDeathDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getProbableDeathDate() {
        return probableDeathDate;
    }

    public void setProbableDeathDate(Date probableDeathDate) {
        this.probableDeathDate = probableDeathDate;
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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
