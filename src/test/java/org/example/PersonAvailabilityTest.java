package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonAvailabilityTest {
    @Test
    public void testAvailabilityWithValidInputs() {
        var availability = new PersonAvailability();
        String employee = "Julius Ssemakula";
        String date = "2024-03-15";
        String time = "10:00 am";
        String expected = "Availability checked for employee " + employee + " on " + date + " at " + time;
        String actual = availability.checkAvailability(employee, date, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testAvailabilityWithInvalidEmployee() {
        var availability = new PersonAvailability();
        String employee = "John Doe"; // Invalid employee
        String date = "2024-03-15";
        String time = "10:00 am";
        String expected = "Invalid employee";
        String actual = availability.checkAvailability(employee, date, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testAvailabilityWithInvalidDate() {
        PersonAvailability availability = new PersonAvailability();
        String employee = "Julius Ssemakula";
        String date = "2024-02-30"; // Invalid date
        String time = "12:00 am"; // Invalid time
        String expected = "Invalid date";
        String actual = availability.checkAvailability(employee, date, time);
        assertEquals(expected, actual);
    }

    @Test
    public void testAvailabilityWithInvalidTime() {
        PersonAvailability availability = new PersonAvailability();
        String employee = "Julius Ssemakula";
        String date = "2024-02-20"; // Invalid date
        String time = "25:00 am"; // Invalid time
        String expected = "Invalid time";
        String actual = availability.checkAvailability(employee, date, time);
        assertEquals(expected, actual);
    }
}
