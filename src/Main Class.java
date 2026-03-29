// File: main/Main.java
package main;

import model.Elevator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of requests:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter floor: ");
            int floor = scanner.nextInt();
            elevator.requestFloor(floor);
        }

        elevator.processRequests();
        scanner.close();
    }
}
