package org.solracdev.kata.comickata

import spock.lang.Specification;

class ConsoleWriterTest extends Specification {

    void "print out list of comic reminders"() {
        given:
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
            PrintStream ps = new PrintStream(baos)

            ConsoleWriter writer = new ConsoleWriter(ps)

            List comics = ['Spider-man', 'Daredevil']

        when:
            writer.write(comics)

        then:
        baos.toString() ==
"""List Of Reminders
Spider-man
Daredevil
"""
    }

}