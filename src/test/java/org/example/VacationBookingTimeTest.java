package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VacationBookingTimeTest {
    @Test
    public void testBookVacationWithValidInputs() {
        var vacationBooking = new VacationBooking();
        String employee = "Julius Ssemakula";
        String startDate = "2024-03-15";
        String endDate = "2024-03-20";
        String expected = "Vacation booked for employee " + employee + " from " + startDate + " to " + endDate;
        String actual = vacationBooking.bookVacation(employee, startDate, endDate);
        assertEquals(expected, actual);
    }

    @Test
    public void testBookVacationWithInvalidEmployee() {
        var vacationBooking = new VacationBooking();
        String employee = "Invalid Employee";
        String startDate = "2024-03-15";
        String endDate = "2024-03-20";
        String expected = "Invalid employee";
        String actual = vacationBooking.bookVacation(employee, startDate, endDate);
        assertEquals(expected, actual);
    }

    @Test
    public void testBookVacationWithInvalidDates() {
        var vacationBooking = new VacationBooking();
        String employee = "Julius Ssemakula";
        String startDate = "2024-03-20";
        String endDate = "2024-03-15"; // End date before start date
        String expected = "End date cannot be before start date";
        String actual = vacationBooking.bookVacation(employee, startDate, endDate);
        assertEquals(expected, actual);
    }
}
