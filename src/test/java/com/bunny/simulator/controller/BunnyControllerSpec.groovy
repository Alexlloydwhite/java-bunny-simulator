package com.bunny.simulator.controller

import com.bunny.simulator.service.CreateColonyService
import spock.lang.Specification
import spock.lang.Subject

class BunnyControllerSpec extends Specification {

    @Subject
    BunnyController sut = new BunnyController(
            createColonyService: Mock(CreateColonyService)
    )

    def "controller calls colony create service to get a new colony of bunnies"() {
        when:
        sut.createNewBunnyColony()

        then:
        1 * sut.createColonyService.createInitialBunnyColony()
    }
}
