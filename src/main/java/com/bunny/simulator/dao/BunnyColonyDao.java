package com.bunny.simulator.dao;

import com.bunny.simulator.domain.Bunny;
import com.bunny.simulator.repository.BunnyColonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BunnyColonyDao {

    @Autowired
    BunnyColonyRepository bunnyColonyRepository;

    public void saveColony(List<Bunny> bunnies) {
        bunnyColonyRepository.saveAll(bunnies);
    }
}
