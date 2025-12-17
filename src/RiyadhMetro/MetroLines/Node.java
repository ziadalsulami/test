package RiyadhMetro.MetroLines;

import java.time.LocalTime;

public class Node {
    String name;
    LocalTime time;
    Node next;
    Node prev;
    public Node(String name) {
        this.name = name;
        this.time = LocalTime.now();
        this.next = null;
        this.prev = null;
    }
    @Override
    public String toString() {
        return "Station name: " + name + "\ntime: " + time;

    
    }

}
