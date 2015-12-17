package org.solracdev.kata.comickata

interface ReminderRepository {


    void add(String s)

    boolean contains(String s)

    List getAll()
}