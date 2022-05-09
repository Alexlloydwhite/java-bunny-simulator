package com.bunny.simulator.dto;

import com.bunny.simulator.domain.Bunny;

import java.util.List;

public class BunnyColony {
    public List<Bunny> bunnies;

    public BunnyColony(List<Bunny> bunnyColony) {
        this.bunnies = bunnyColony;
    }
}
