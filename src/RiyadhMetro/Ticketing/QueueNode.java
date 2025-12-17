package RiyadhMetro.Ticketing;

public class QueueNode {
     Passenger passenger;
     QueueNode next;

     public QueueNode(Passenger passenger, QueueNode next) {
        this.passenger = passenger;
        this.next = next;
     }

     


}
