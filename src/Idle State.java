// File: state/IdleState.java
package state;

import model.Elevator;

public class IdleState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {
        if (floor > elevator.getCurrentFloor()) {
            elevator.setState(new MovingUpState());
        } else if (floor < elevator.getCurrentFloor()) {
            elevator.setState(new MovingDownState());
        }
    }

    @Override
    public void move(Elevator elevator) {
        System.out.println("Elevator is idle at floor " + elevator.getCurrentFloor());
    }
}
