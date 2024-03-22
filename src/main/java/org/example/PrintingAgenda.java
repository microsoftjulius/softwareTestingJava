package org.example;

import java.util.HashMap;
import java.util.Map;

public class PrintingAgenda {
    // Define valid room names
    private static final Map<String, String> roomAgendas = new HashMap<>();
    static {
        roomAgendas.put("Room A", "Agenda for Room A");
        roomAgendas.put("Room B", "Agenda for Room B");
        roomAgendas.put("Room C", "Agenda for Room C");
        roomAgendas.put("Room D", "Agenda for Room D");
        roomAgendas.put("Room E", "Agenda for Room E");
        roomAgendas.put("Room F", "Agenda for Room F");
    }

    public String printAgenda(String room) {
        // Check if the provided room is valid
        if (!roomAgendas.containsKey(room)) {
            return "Invalid room. Please specify one of the valid rooms: " + roomAgendas.keySet();
        }

        // Logic to print agenda for the specified room
        return roomAgendas.get(room);
    }
}
