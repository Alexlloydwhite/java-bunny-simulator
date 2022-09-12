package com.bunny.simulator.model;

import javax.persistence.*;

@Entity
@Table(name = "colonies")
public class BunnyColonyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "gender")
    private String gender;

    @Column(name = "color")
    private String color;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;

    @Column(name = "isRadioactiveMutantVampire")
    private boolean isRadioactiveMutantVampire;

    public long getId() {
        return id;
    }

    public String getGender() { return gender; }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsRadioactiveMutantVampire () {
        return isRadioactiveMutantVampire;
    }

    public void setIsRadioactiveMutantVampire (boolean isRadioactiveMutantVampire) {
        this.isRadioactiveMutantVampire = isRadioactiveMutantVampire;
    }
}
