package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoomAvailabilityTest {
    @Test
    public void testCheckAvailabilityWithValidInputs() {
        RoomAvailability roomAvailability = new RoomAvailability();
        String room = "Room A";
        String date = "2024-03-15";
        String time = "10:00";
        String expected = "Room Room A is available on 2024-03-15 at 10:00";
        String actual = roomAvailability.checkAvailability(room, date, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAvailabilityWithInvalidRoom() {
        RoomAvailability roomAvailability = new RoomAvailability();
        String room = "Room X"; // Invalid room
        String date = "2024-03-15";
        String time = "10:00";
        String expected = "Invalid room. Please specify one of the valid rooms: [Room B, Room A, Room D, Room C, Room F, Room E]";
        String actual = roomAvailability.checkAvailability(room, date, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAvailabilityWithInvalidDateTime() {
        RoomAvailability roomAvailability = new RoomAvailability();
        String room = "Room A";
        String date = "2024-02-20"; // Invalid date
        String time = "25:00"; // Invalid time
        String expected = "Invalid date or time";
        String actual = roomAvailability.checkAvailability(room, date, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testBookMeetingWithNullInputs() {
        var meetingBookingObj = new MeetingBooking();
        // Use assertThrows to verify that NullPointerException is thrown
        assertThrows(NullPointerException.class, () -> meetingBookingObj.bookMeeting(null, null, null));
    }
}
