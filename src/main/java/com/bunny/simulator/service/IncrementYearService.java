package com.bunny.simulator.service;

import com.bunny.simulator.constants.Gender;
import com.bunny.simulator.domain.Bunny;
import com.bunny.simulator.dto.BunnyColony;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class IncrementYearService {

    public BunnyColony incrementYear(BunnyColony colony) {
        AtomicBoolean canReproduce = new AtomicBoolean(false);

        for (Bunny bunny : colony.bunnies) {
            if (bunny.getAge() == 9) {
                colony.bunnies.remove(bunny);
            }

            bunny.setAge(bunny.getAge() + 1);

            if ((bunny.getGender() == Gender.MALE) && (bunny.getAge() >= 2)) {
                canReproduce.set(true);
            }
        }

        return colony;
    }
}
