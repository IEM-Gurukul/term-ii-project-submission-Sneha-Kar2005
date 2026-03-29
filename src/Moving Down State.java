// File: state/MovingDownState.java
package state;

import model.Elevator;

public class MovingDownState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Already moving down...");
    }

    @Override
    public void move(Elevator elevator) {
        elevator.decrementFloor();
        System.out.println("Moving down to floor: " + elevator.getCurrentFloor());

        if (elevator.getCurrentFloor() == elevator.getTargetFloor()) {
            elevator.setState(new DoorOpenState());
        }
    }
}
