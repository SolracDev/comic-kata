package org.solracdev.kata.comickata

import org.solracdev.kata.comickata.domain.Reminder
import org.solracdev.kata.comickata.repository.ReminderRepository
import spock.lang.Specification

class ComicReminderTest extends Specification {

    def "Should be able to store a reminder"() {

        given:
        ReminderRepository reminderRepositoryMock = Mock(ReminderRepository.class)
        ComicReminder comicReminder = new ComicReminder(reminderRepository: reminderRepositoryMock)

        when:
        comicReminder.addReminder("Spider-man")

        then:
        1 * reminderRepositoryMock.addReminder(new Reminder(comicName: "Spider-man"))


    }

    def "Should be able to print all the stored reminders"(){

    }

}
