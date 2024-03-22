package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class PersonAvailability {
    private static final List<String> validEmployees = Arrays.asList(
            "Julius Ssemakula",
            "Alex Mujjuni",
            "James Ociba",
            "Ruth Namakula",
            "Joseph Katende");

    public String checkAvailability(String employee, String date, String time) {
        System.out.println("Employee: " + employee);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);

        // Check if the employee is valid
        if (!isValidEmployee(employee)) {
            return "Invalid employee";
        }

        // Check if the date is valid
        if (!isValidDate(date)) {
            return "Invalid date";
        }

        // Check if the time is valid
        if (!isValidTime(time)) {
            return "Invalid time";
        }

        // Logic to check availability for the person with the specified inputs
        return "Availability checked for employee " + employee + " on " + date + " at " + time;
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

    private boolean isValidTime(String time) {
        try {
            LocalTime.parse(time, DateTimeFormatter.ofPattern("h:mm a"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
