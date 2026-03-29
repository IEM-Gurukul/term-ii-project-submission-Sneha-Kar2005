// File: model/Elevator.java
// File: model/Elevator.java
package model;

import state.*;
import service.RequestQueue;

public class Elevator {
    private int currentFloor;
    private State currentState;
    private RequestQueue requestQueue;
    private int targetFloor;
    private int maxFloor = 10;

    public Elevator() {
        this.currentFloor = 0;
        this.currentState = new IdleState();
        this.requestQueue = new RequestQueue();
    }

    public void requestFloor(int floor) {
        if (floor < 0 || floor > maxFloor) {
            throw new IllegalArgumentException("Invalid floor!");
        }
        requestQueue.addRequest(floor);
        currentState.handleRequest(this, floor);
    }

    public void processRequests() {
        while (!requestQueue.isEmpty()) {
            targetFloor = requestQueue.getNextRequest();
            while (currentFloor != targetFloor) {
                currentState.move(this);
            }
            currentState = new DoorOpenState();
            currentState.move(this);
        }
        setState(new IdleState());
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void incrementFloor() {
        currentFloor++;
    }

    public void decrementFloor() {
        currentFloor--;
    }

    public int getTargetFloor() {
        return targetFloor;
    }
}
