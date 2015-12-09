package org.solracdev.kata.comickata

class Application {

    static void main(String[] args) {

        ComicReminder comicReminder = new ComicReminder()
        comicReminder.addReminder("Spider-Man")
        comicReminder.addReminder("Dare-Devil")
        comicReminder.listReminders()
        comicReminder.checkUpcomingComics()

    }
}
