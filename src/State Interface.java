// File: state/State.java
package state;

import model.Elevator;

public interface State {
    void handleRequest(Elevator elevator, int floor);
    void move(Elevator elevator);
}
