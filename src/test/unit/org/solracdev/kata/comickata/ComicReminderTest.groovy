package org.solracdev.kata.comickata

import spock.lang.Specification;

import static org.junit.Assert.*;

class ComicReminderTest extends Specification {

    void "should add a reminder"() {


        given:
            String comicName = 'Spider-man'
        
            ReminderRepository reminderRepositoryMock = Mock(ReminderRepository.class)
            ComicReminder reminder = new ComicReminder(reminderRepositoryMock)

        when:
            reminder.addReminder(comicName)

        then:
        1 * reminderRepositoryMock.add(comicName)
    }

}