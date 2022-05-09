package com.bunny.simulator.service

import com.bunny.simulator.constants.Gender
import com.bunny.simulator.constants.Name
import com.bunny.simulator.domain.Bunny
import com.bunny.simulator.dto.BunnyColony
import spock.lang.Specification
import spock.lang.Subject

class CreateColonyServiceSpec extends Specification {

    @Subject
    CreateColonyService sut = new CreateColonyService()

    def "createInitialBunnyColony returns a list of 5 bunnies"() {
        when:
        BunnyColony bunnies = sut.createInitialBunnyColony()

        then:
        bunnies.bunnies.size() == 5
        bunnies.bunnies[0].gender
        bunnies.bunnies[0].color
        bunnies.bunnies[0].age
        bunnies.bunnies[0].name
        !bunnies.bunnies[0].isRadioactiveMutantVampire
    }

    def "createNewBunny creates a new Bunny Object"() {
        given:

        when:
        Bunny bunny = sut.createNewBunny()

        then:
        bunny.gender
        bunny.color
        bunny.age
        bunny.name
        !bunny.isRadioactiveMutantVampire
    }

    def "assignNameFrom takes a gender and picks a random name for the bunny"() {
        given:
        Gender gender = Gender.FEMALE

        when:
        Name name = sut.assignNameFrom(gender)

        then:
        name
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
