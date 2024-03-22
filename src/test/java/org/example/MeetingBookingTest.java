package org.example;

import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MeetingBookingTest {
    @Test
    public void testBookMeetingValidInputs() {
        var meetingBookingObj = new MeetingBooking();
        String room = "Room A";
        String dateString = "2024-03-20";
        String time = "10:00 AM";
        String expected = "Meeting booked in room " + room + " on " + dateString + " at " + time;
        String actual = meetingBookingObj.bookMeeting(room, dateString, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testBookMeetingInValidRoom() {
        var meetingBookingObj = new MeetingBooking();
        String room = "InvalidRoom";
        String dateString = "2024-03-20";
        String time = "10:00 AM";
        String expected = "Invalid room. Please specify one of the valid rooms: [Room B, Room A, Room D, Room C, Room F, Room E]";
        String actual = meetingBookingObj.bookMeeting(room, dateString, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testBookMeetingInValidDate() {
        MeetingBooking meetingBookingObj = new MeetingBooking();
        String room = "Room A";
        String dateString = "2024-02-35";
        String time = "10:00 AM";
        String expected = "Invalid date or time format. Please specify the date in the format: yyyy-MM-dd and time in 12-hour format";
        String actual = meetingBookingObj.bookMeeting(room, dateString, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testBookMeetingValidTime() {
        var meetingBookingObj = new MeetingBooking();
        String room = "Room A";
        String dateString = "2024-03-20";
        String time = "08:00 PM";
        String expected = "Meeting time is beyond working hours (8:00 am to 5:00 pm)";
        String actual = meetingBookingObj.bookMeeting(room, dateString, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testBookMeetingWithNullInputs() {
        var meetingBookingObj = new MeetingBooking();
        try {
            meetingBookingObj.bookMeeting(null, null, null); // This should throw NullPointerException
            fail("Expected NullPointerException was not thrown");
        } catch (NullPointerException e) {
            // The NullPointerException was thrown, which is expected
        }
    }
}
