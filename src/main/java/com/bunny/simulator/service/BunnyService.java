package com.bunny.simulator.service;

import com.bunny.simulator.constants.*;
import com.bunny.simulator.domain.Bunny;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Service
public class BunnyService {

    private static final SecureRandom random = new SecureRandom();

    public List<Bunny> createInitialBunnyColony() {
        List<Bunny> bunnyColony = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            bunnyColony.add(createNewBunny());
        }

        return bunnyColony;
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
