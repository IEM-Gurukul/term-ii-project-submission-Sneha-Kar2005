// File: state/MovingUpState.java
package state;

import model.Elevator;

public class MovingUpState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Already moving up...");
    }

    @Override
    public void move(Elevator elevator) {
        elevator.incrementFloor();
        System.out.println("Moving up to floor: " + elevator.getCurrentFloor());

        if (elevator.getCurrentFloor() == elevator.getTargetFloor()) {
            elevator.setState(new DoorOpenState());
        }
    }
}
