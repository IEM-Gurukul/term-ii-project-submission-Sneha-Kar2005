// File: state/DoorClosedState.java
package state;

import model.Elevator;

public class DoorClosedState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Door closed.");
    }

    @Override
    public void move(Elevator elevator) {
        System.out.println("Door closed. Ready for next request.");
        elevator.setState(new IdleState());
    }
}
