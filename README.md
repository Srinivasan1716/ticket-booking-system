# Ticket Booking System (Java)

## Description
This is a beginner-friendly Java application that simulates
a ticket booking system using multithreading.

Multiple users (threads) try to book limited seats.
Synchronization is used to prevent race conditions
and double booking.

## Features
- Multiple users using threads
- Synchronized ticket booking
- Prevents race conditions
- Simple console-based Java app

## Concepts Used
- Java Threads
- Synchronization
- Race Condition
- Object-Oriented Programming

## Project Structure
src/
- TicketCounter.java
- UserThread.java
- MainApp.java

## How It Works
Each user is represented as a thread.
Only one thread can book tickets at a time
using a synchronized method.
