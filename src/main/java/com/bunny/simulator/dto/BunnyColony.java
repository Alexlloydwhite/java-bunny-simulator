package com.bunny.simulator.dto;

import com.bunny.simulator.domain.Bunny;

import java.util.List;

public class BunnyColony {
    public List<Bunny> colony;

    public BunnyColony(List<Bunny> bunnyColony) {
        this.colony = bunnyColony;
    }
}
