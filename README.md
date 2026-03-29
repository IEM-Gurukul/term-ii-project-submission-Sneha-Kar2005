[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

Project Title
   Simulation of Elevator Control System using State Pattern
Problem Statement

Modern buildings depend on efficient elevator systems to manage vertical transportation. Designing such systems involves handling multiple operational states like idle, moving up, moving down, and door operations while responding to user requests dynamically. Traditional implementations often rely on complex conditional logic, making the system difficult to maintain and extend.
This project simulates an Elevator Control System using the State Design Pattern, where each operational state is represented by a separate class. The system dynamically changes behavior based on its current state, improving modularity and scalability. Enhanced with granular door states (open, closing, closed) and a real-time status display, the simulation provides a clear and practical understanding of elevator operations while demonstrating strong object-oriented design principles.

Target User
  Computer Science students
  Beginners learning OOP and Design Patterns
  Developers exploring real-world system design

Core Features
 
  Floor request handling
  Elevator movement simulation (up/down)
  State transitions:
    IdleState
    MovingUpState
    MovingDownState
    DoorOpenState
    DoorClosingState
    DoorClosedState
Multiple request handling using queue
Door operation simulation
Real-time status display (Console / GUI)
Exception handling for invalid inputs

OOP Concepts Used
  Abstraction – State interface defines common behavior
  Inheritance – Concrete state classes implement State
  Polymorphism – Dynamic behavior based on current state
  Encapsulation – Elevator data and state are protected
  Exception Handling – Handles invalid floor inputs
  Collections – Queue used for managing requests

Proposed Architecture Description

The system follows the State Design Pattern where the Elevator class acts as the context, maintaining the current state and floor. A State interface defines common operations, and multiple concrete state classes (Idle, Moving, Door states) implement specific behaviors.

The elevator dynamically transitions between states based on user requests and internal conditions. A request queue manages multiple floor calls efficiently, while a UI layer (console or Java Swing GUI) displays real-time status.

This architecture eliminates complex conditional logic, improves modularity, and allows easy extension of new states or features.

How to Run
  Prerequisites
    Java JDK (version 8 or above)
    Any IDE (IntelliJ / Eclipse / VS Code)
  Steps to Run
     Clone or download the project
     Open the project in your IDE
     Navigate to:
         src/com/elevator/main/Main.java
     Compile and run the Main class
     Provide floor inputs when prompted
  Output
     Console displays:
        Current floor
        Current state
        Movement and door actions
