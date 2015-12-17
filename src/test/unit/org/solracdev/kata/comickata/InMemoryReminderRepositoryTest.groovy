package org.solracdev.kata.comickata

import spock.lang.Specification

/**
 * Created by loic.cara on 12/17/15.
 */
class InMemoryReminderRepositoryTest extends Specification {

    void "add a reminder to the repository"(){
        given:
            String comicName = 'Batman even if is from DC'
            ReminderRepository reminderRepository = new InMemoryReminderRepository()

        when:
            reminderRepository.add(comicName)

        then:
            reminderRepository.contains(comicName)
    }
}
