package org.solracdev.kata.comickata.repository

import org.solracdev.kata.comickata.domain.Reminder

interface ReminderRepository {

    void addReminder(Reminder reminder)

    List findAll()

}