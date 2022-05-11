package com.bunny.simulator.model;

import com.bunny.simulator.domain.Bunny;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "colonies")
public class BunnyColonyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "colony")
    @ElementCollection(targetClass = Bunny.class)
    private List<Bunny> colony;

    public BunnyColonyModel(List<Bunny> colony) {
        this.colony = colony;
    }

    public long getId() {
        return id;
    }

    public List<Bunny> getColony() {
        return colony;
    }

    public void setColony(List<Bunny> colony) {
        this.colony = colony;
    }
}
