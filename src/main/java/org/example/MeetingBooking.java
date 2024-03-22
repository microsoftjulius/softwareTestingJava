package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MeetingBooking {

    // Define valid room names
    private static final Set<String> validRooms = new HashSet<>();
    static {
        validRooms.add("Room A");
        validRooms.add("Room B");
        validRooms.add("Room C");
        validRooms.add("Room D");
        validRooms.add("Room E");
        validRooms.add("Room F");
    }

    public String bookMeeting(String room, String dateString, String time) {
        // Check if the provided room is valid
        if (!validRooms.contains(room)) {
            return "Invalid room. Please specify one of the valid rooms: " + validRooms;
        }

        // Parse the date string to check if it's valid
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); // Disable lenient parsing
        try {
            Date parsedDate = dateFormat.parse(dateString);
            // Check if the parsed date matches the input date
            String parsedDateString = dateFormat.format(parsedDate);
            if (!parsedDateString.equals(dateString)) {
                return "Invalid date: " + dateString;
            }

            // Check if the provided time is within working hours (8:00 am to 5:00 pm)
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
            Date startTime = timeFormat.parse("08:00 AM");
            Date endTime = timeFormat.parse("05:00 PM");
            Date meetingTime = timeFormat.parse(time);
            if (meetingTime.before(startTime) || meetingTime.after(endTime)) {
                return "Meeting time is beyond working hours (8:00 am to 5:00 pm)";
            }

            // Logic to book the meeting in the specified room at the given date and time
            return "Meeting booked in room " + room + " on " + dateString + " at " + time;
        } catch (ParseException e) {
            // Invalid date or time format
            return "Invalid date or time format. Please specify the date in the format: yyyy-MM-dd and time in 12-hour format";
        }
    }
}
