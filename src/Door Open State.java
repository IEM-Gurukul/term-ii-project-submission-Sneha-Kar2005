// File: state/DoorOpenState.java
package state;

import model.Elevator;

public class DoorOpenState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Door is open, please wait...");
    }

    @Override
    public void move(Elevator elevator) {
        System.out.println("Door opening at floor " + elevator.getCurrentFloor());
        elevator.setState(new DoorClosingState());
    }
}
