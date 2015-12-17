package org.solracdev.kata.comickata

class ComicReminder {

    private Writer writer

    private ReminderRepository reminderRepository

    ComicReminder(ReminderRepository reminderRepository, Writer writer) {
        this.reminderRepository = reminderRepository
        this.writer = writer
    }

    void addReminder(String comicName) {
        reminderRepository.add(comicName)
    }

    void listReminders(){
        writer.write(reminderRepository.getAll())
    }

    void checkUpcomingComics(){

    }
}
