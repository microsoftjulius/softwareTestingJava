package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class VacationBooking {
    private static final List<String> validEmployees = Arrays.asList(
            "Julius Ssemakula",
            "Alex Mujjuni",
            "James Ociba",
            "Ruth Namakula",
            "Joseph Katende");

    public String bookVacation(String employee, String startDate, String endDate) {
        // Check if the employee is valid
        if (!isValidEmployee(employee)) {
            return "Invalid employee";
        }

        // Check if the start date is valid
        if (!isValidDate(startDate)) {
            return "Invalid start date";
        }

        // Check if the end date is valid
        if (!isValidDate(endDate)) {
            return "Invalid end date";
        }

        // Parse start and end dates
        LocalDate startDateObj = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateObj = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);

        // Check if end date is before start date
        if (endDateObj.isBefore(startDateObj)) {
            return "End date cannot be before start date";
        }

        // Logic to book vacation for the employee with the specified inputs
        return "Vacation booked for employee " + employee + " from " + startDate + " to " + endDate;
    }

    private boolean isValidEmployee(String employee) {
        return validEmployees.contains(employee);
    }

    private boolean isValidDate(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
