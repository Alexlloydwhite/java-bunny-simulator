package com.bunny.simulator.domain;

import com.bunny.simulator.constants.Color;
import com.bunny.simulator.constants.Gender;
import com.bunny.simulator.constants.Name;

public class Bunny {

    private final Gender gender;
    private final Color color;
    private final int age;
    private final Name name;
    private final Boolean radioactiveMutantVampire;

    public Bunny(Gender gender, Color color, int age, Name name, Boolean radioactiveMutantVampire) {
        this.gender = gender;
        this.color = color;
        this.age = age;
        this.name = name;
        this.radioactiveMutantVampire = radioactiveMutantVampire;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Color getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public Name getName() {
        return this.name;
    }

    public Boolean getRadioactiveMutantVampire() {
        return this.radioactiveMutantVampire;
    }
}
