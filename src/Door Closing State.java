// File: state/DoorClosingState.java
package state;

import model.Elevator;

public class DoorClosingState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Door is closing...");
    }

    @Override
    public void move(Elevator elevator) {
        System.out.println("Door closing...");
        elevator.setState(new DoorClosedState());
    }
}
