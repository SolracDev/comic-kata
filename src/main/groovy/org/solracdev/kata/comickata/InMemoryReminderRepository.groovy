package org.solracdev.kata.comickata

/**
 * Created by loic.cara on 12/17/15.
 */
class InMemoryReminderRepository implements ReminderRepository {

    private List reminders = []

    InMemoryReminderRepository() {
    }

    @Override
    void add(String reminderName) {
        reminders.add(reminderName)
    }

    @Override
    boolean contains(String s) {
        reminders.contains(s)
    }

    @Override
    List getAll() {
        reminders
    }
}
