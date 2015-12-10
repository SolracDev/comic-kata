package org.solracdev.kata.comickata

import org.solracdev.kata.comickata.domain.Reminder
import org.solracdev.kata.comickata.repository.ReminderRepository

class ComicReminder {

    private ReminderRepository reminderRepository

    void addReminder(String comicName) {
        reminderRepository.addReminder(new Reminder(comicName: comicName))
    }

    void listReminders(){

    }

    void checkUpcomingComics(){

    }

}
