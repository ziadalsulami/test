package RiyadhMetro.MetroLines;

public class Line {
    private Node head;
    private int size;

    public void addFirst(String name) {
        Node node = new Node(name);
        if(head==null) {
            head= node;
            head.next=node;
            head.prev=node;
        }

        else {
            Node tail = head.prev;
            node.next=head;
            node.prev=tail;
            head.prev=node;
            tail.next=node;
            head = node;
            
        }
        size++;
    }

    public void addLast(String name) {
        Node node = new Node(name);
        if(head==null) addFirst(name);
        else {
            Node tail = head.prev;
            tail.next=node;
            node.prev=tail;
            node.next=head;
            head.prev=node;

        }
        size++;
    }

    public void addBetween(String newStation, String afterStation ) {
        if(head==null) {
            System.out.println("line is empty");
            return;
    }
    Node curr = head;
    for(int i=0;i<size;i++) {
        if(curr.name.equalsIgnoreCase(afterStation)){
            Node n = new Node(newStation);
            Node nextNode = curr.next;

            curr.next=n;
            n.prev=curr;
            n.next=nextNode;
            nextNode.prev=n;
            size++;
            return;
        }
        curr=curr.next;
    }
}
 public void remove(String name) {
    if(head==null){ System.out.println("EMPTY");
    return;}

     if(size==1 && head.name.equalsIgnoreCase(name)) {
    head = null; 
    size=0;
    return;
 }
Node curr = head;
 for(int i=0; i<size; i++) {
    if(curr.name.equalsIgnoreCase(name)) {
        Node currNext = curr.next;
        curr.prev.next=currNext;
        currNext.prev=curr.prev;
        size--;
        return;
    }
    curr=curr.next;
 }
 }

}
