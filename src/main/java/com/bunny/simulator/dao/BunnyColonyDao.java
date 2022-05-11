package com.bunny.simulator.dao;

import com.bunny.simulator.domain.Bunny;
import com.bunny.simulator.dto.BunnyColony;
import com.bunny.simulator.model.BunnyColonyModel;
import com.bunny.simulator.repository.BunnyColonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BunnyColonyDao {

    @Autowired
    BunnyColonyRepository bunnyColonyRepository;

    public BunnyColony saveColony(List<Bunny> bunnies) {
        BunnyColonyModel bunnyColonyModel = bunnyColonyRepository.save(new BunnyColonyModel(1, bunnies));
        return new BunnyColony((List<Bunny>) bunnyColonyModel);
    }
}
