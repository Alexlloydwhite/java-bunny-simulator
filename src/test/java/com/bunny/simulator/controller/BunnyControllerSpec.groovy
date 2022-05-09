package com.bunny.simulator.controller

import com.bunny.simulator.service.BunnyService
import spock.lang.Specification
import spock.lang.Subject

class BunnyControllerSpec extends Specification {

    @Subject
    BunnyController sut = new BunnyController(
            bunnyService: Mock(BunnyService)
    )

    def "controller calls service to get list of bunnies"() {
        when:
        sut.createNewBunnyColony()

        then:
        1 * sut.bunnyService.createInitialBunnyColony()
    }
}
