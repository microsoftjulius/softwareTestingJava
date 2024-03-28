# Meeting Booking System - Test Suite

## Overview
This repository contains the test suite for the Meeting Booking System. The Meeting Booking System is a Java application designed to manage meetings, vacation bookings, and check availabilities for rooms and employees.

## Contents
1. [MeetingBookingTest](#meetingbookingtest)
2. [PersonAvailabilityTest](#personavailabilitytest)
3. [PrintingAgendaTest](#printingagendatest)
4. [RoomAvailabilityTest](#roomavailabilitytest)
5. [VacationBookingTest](#vacationbookingtest)

---

### MeetingBookingTest

This test suite contains tests for the `MeetingBooking` class, which is responsible for booking meetings. It includes tests for:
- Booking a meeting with valid inputs
- Booking a meeting with an invalid date
- Booking a meeting with a time beyond working hours

---

### PersonAvailabilityTest

This test suite contains tests for the `PersonAvailability` class, which checks the availability of a person. It includes tests for:
- Checking availability with valid inputs
- Checking availability with an invalid employee
- Checking availability with an invalid date/time

---

### PrintingAgendaTest

This test suite contains tests for the `PrintingAgenda` class, which prints the agenda for a room. It includes tests for:
- Printing agenda for a room with valid room
- Printing agenda for a room with an invalid room

---

### RoomAvailabilityTest

This test suite contains tests for the `RoomAvailability` class, which checks the availability of a room. It includes tests for:
- Checking availability for a room with valid inputs
- Checking availability for a room with an invalid room
- Checking availability for a room with an invalid date/time

---

### VacationBookingTest

This test suite contains tests for the `VacationBooking` class, which handles vacation bookings. It includes tests for:
- Booking vacation time for an employee with valid inputs
- Booking vacation time for an employee with an invalid employee
- Booking vacation with invalid start/end dates

---

## How to Run the Tests

To run the tests, follow these steps:

1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Navigate to the test classes mentioned above.
4. Right-click on the class name and select "Run" or "Run As JUnit Test" to execute the tests.

---

Feel free to contribute to this project by adding more tests or improving existing ones!

---


