// File: service/RequestQueue.java
package service;

import java.util.*;

public class RequestQueue {
    private Queue<Integer> queue = new LinkedList<>();

    public void addRequest(int floor) {
        queue.offer(floor);
    }

    public int getNextRequest() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
