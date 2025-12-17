package RiyadhMetro.Ticketing;

public class Queue {
    QueueNode front;
    QueueNode back;
    int size;

    public Queue() {
        front = back = null;
        size=0;
    }

    public void enqueue(Passenger passenger) {
        QueueNode newNode = new QueueNode(passenger, null);
        if(size==0) {
            front = back = newNode;
            size++;
        }
        else {
            back.next = newNode;
            back = newNode;
            size++;
        }
    }

    public Passenger dequeue() {
        if(size==0) return null;
 
        Passenger temp = front.passenger;
        front=front.next;
        if(front==null) back=null;
        size--;
        return temp;
    }

    public Passenger peek() {
        if(size==0) return null;
        else return front.passenger;
    }

    public boolean isFree() {
        return size==0;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        if(size==0) System.out.println("Queue is empty");
        QueueNode curr = front;
        int pos=1;
        while(curr != null) {
            System.out.println(pos+": "+curr.passenger);
            curr=curr.next;
            pos++;

        }


    }

    public int find(String name) {
        int pos=1;
        if(isFree()) return -1;
        else {
            QueueNode curr = front;
            while(curr!=null) {
                if(curr.passenger.getName().equals(name)) {
                    return pos;
                }
                curr=curr.next;
                pos++;
            }
        }
        return -1;

    }




}
