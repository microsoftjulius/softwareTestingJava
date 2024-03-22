package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrintingAgendaTest {
    @Test
    public void testPrintAgendaWithValidRoom() {
        var printingAgenda = new PrintingAgenda();
        String room = "Room A";
        String expected = "Agenda for Room A";
        String actual = printingAgenda.printAgenda(room);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintAgendaWithInvalidRoom() {
        var printingAgenda = new PrintingAgenda();
        String room = "Room X"; // Invalid room
        String expected = "Invalid room. Please specify one of the valid rooms: [Room B, Room A, Room D, Room C, Room F, Room E]";
        String actual = printingAgenda.printAgenda(room);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintAgendaWithNullRoom() {
        var printingAgenda = new PrintingAgenda();
        String room = null;
        assertThrows(IllegalArgumentException.class, () -> printingAgenda.printAgenda(room));
    }
}
