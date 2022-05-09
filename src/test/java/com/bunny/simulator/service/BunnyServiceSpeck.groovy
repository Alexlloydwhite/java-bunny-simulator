package com.bunny.simulator.service

import com.bunny.simulator.constants.Color
import com.bunny.simulator.constants.FemaleName
import com.bunny.simulator.constants.Gender
import com.bunny.simulator.constants.Name
import com.bunny.simulator.domain.Bunny
import spock.lang.Specification
import spock.lang.Subject

class BunnyServiceSpeck extends Specification {

    @Subject
    BunnyService sut = new BunnyService()

    def "createInitialBunnyColony returns a list of 5 bunnies"() {
        when:
        List<Bunny> bunnies = sut.createInitialBunnyColony();

        then:
        bunnies.size() == 5
        bunnies[0].gender
        bunnies[0].color
        bunnies[0].age
        bunnies[0].name
        !bunnies[0].radioactiveMutantVampire
    }

    def "createNewBunny creates a new Bunny Object"() {
        given:
        Gender gender = Gender.FEMALE
        Color color = Color.SPOTTED
        int age = 8;
        Name name = FemaleName.ALICE

        when:
        Bunny bunny = sut.createNewBunny()

        then:
//        1 * sut.randomValueFromEnum(Gender.class) >> gender
//        1 * sut.randomValueFromEnum(Color.class) >> color
//        1 * sut.randomBunnyAge >> age
//        1 * sut.assignNameFrom(Gender.FEMALE) >> name

        bunny
    }

    def "randomBunnyAge returns a random int between 0 and 10"() {
        when:
        int age = sut.randomBunnyAge()

        then:
        age >= 0
        age <= 10
    }

    def "randomValueFromEnum takes an enum class and returns a random value"() {
        when:
        SomeFakeEnum value = sut.randomValueFromEnum(SomeFakeEnum.class)

        then:
        value == SomeFakeEnum.SOME_VALUE || SomeFakeEnum.SOME_OTHER_VALUE
    }

    private enum SomeFakeEnum {
        SOME_VALUE,
        SOME_OTHER_VALUE
    }
}
