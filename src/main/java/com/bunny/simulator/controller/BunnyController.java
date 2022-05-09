package com.bunny.simulator.controller;

import com.bunny.simulator.dto.BunnyColony;
import com.bunny.simulator.service.BunnyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BunnyController {

    @Autowired
    BunnyService bunnyService;

    @PostMapping (path = "/newColony")
    public BunnyColony createNewBunnyColony() {
        return bunnyService.createInitialBunnyColony();
    }
}
