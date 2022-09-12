package com.bunny.simulator.service;

import com.bunny.simulator.constants.*;
import com.bunny.simulator.dao.BunnyColonyDao;
import com.bunny.simulator.domain.Bunny;
import com.bunny.simulator.dto.BunnyColony;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Service
public class CreateColonyService {

    @Autowired
    BunnyColonyDao bunnyColonyDao;

    private static final SecureRandom random = new SecureRandom();

    public BunnyColony createInitialBunnyColony() {
        List<Bunny> bunnies = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Bunny newBunny = createNewBunny();
            bunnies.add(newBunny);
        }

        try {
            bunnyColonyDao.saveColony(bunnies);
        } catch (Exception e) {
           throw new RuntimeException("unable to save bunny colony", e);
        }

        return new BunnyColony(bunnies);
    }

    private Bunny createNewBunny() {
        Gender gender = randomValueFromEnum(Gender.class);
        Color color = randomValueFromEnum(Color.class);
        int age = randomBunnyAge();
        Name name = assignNameFrom(gender);
        return new Bunny(gender, color, age, name, false);
    }

    private Name assignNameFrom(Gender gender) {
        Name name;
        if (gender == Gender.FEMALE) {
            name = randomValueFromEnum(FemaleName.class);
        } else {
            name = randomValueFromEnum(MaleName.class);
        }
        return name;
    }

    private static <T extends Enum<?>> T randomValueFromEnum(Class<T> clazz) {
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

    private static int randomBunnyAge() {
        int minAge = 0;
        int maxAge = 10;
        return random.nextInt((maxAge - minAge) + 1) - minAge;
    }
}
