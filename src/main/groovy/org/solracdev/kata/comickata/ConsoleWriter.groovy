package org.solracdev.kata.comickata

/**
 * Created by loic.cara on 12/17/15.
 */
class ConsoleWriter implements Writer {

    PrintStream outputStream

    ConsoleWriter(OutputStream outputStream) {
        this.outputStream = outputStream
    }

    @Override
    void write(List comics) {
        outputStream.println("List Of Reminders")

        comics.each {
            outputStream.println(it)
        }
    }
}
