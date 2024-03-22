package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

public class RoomAvailability {
    // Define valid room names
    private static final Map<String, Boolean> roomAvailability = new HashMap<>();
    static {
        roomAvailability.put("Room A", true);
        roomAvailability.put("Room B", true);
        roomAvailability.put("Room C", false);
        roomAvailability.put("Room D", true);
        roomAvailability.put("Room E", false);
        roomAvailability.put("Room F", true);
    }

    public String checkAvailability(String room, String date, String time) {
        // Check if the provided room is valid
        if (!roomAvailability.containsKey(room)) {
            return "Invalid room. Please specify one of the valid rooms: " + roomAvailability.keySet();
        }

        // Check if the date is valid
        try {
            LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            return "Invalid date or time";
        }

        // Check if the time is valid
        try {
            LocalTime.parse(time);
        } catch (DateTimeParseException e) {
            return "Invalid date or time";
        }

        // Logic to check actual availability based on date/time (not implemented yet)
        // For now, just return a message indicating the room is available
        return "Room " + room + " is available on " + date + " at " + time;
    }
}
