package RiyadhMetro.Maintenance;

public class MinHeap {
    private MaintenanceRequest[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        heap = new MaintenanceRequest[capacity];
        this.capacity=capacity;
        size=0;
    }

    public int getSize() {
        return size;
    }

    private int parent(int i) {
        return (i-1)/2;
    }
    private int left(int i) {
        return 2*i+1;
    }

    private int right(int i) {
        return 2*i+2;
    }

    public boolean hasLeft(int i) {
        return left(i)<size;
    }
    public boolean hasRight(int i) {
        return right(i)<size;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public void swap(int i, int j) {
        MaintenanceRequest temp= heap[i];
        heap[i] = heap[j];
        heap[j]=temp;
    }



    public void insert(MaintenanceRequest request) {
        if(size>=capacity) {
            System.out.println("FULL HEAP");
            return;
    }
    heap[size]=request;
    bubbleUp(size); //we pass the index to start with where we added the new request
    size++;

    }

    private void bubbleUp(int i) {
        while(i>0) {
            int parent = parent(i);
            if(heap[i].compareTo(heap[parent])<0) {
                swap(i, parent);
                i = parent; //important
            } else break;
        }
    }

    public MaintenanceRequest removeMin() {
        if(isEmpty()) return null;

        MaintenanceRequest min = heap[0];
        size--;

        if(size>0){
        heap[0] = heap[size]; //why not size+1? prbobably becayse q nvm i get it
        heap[size]=null;
        bubbleDown(0);
    }else heap[0]=null;

    return min;

    }

    private void bubbleDown(int i) {
        int left = left(i);
        int right = right(i);
        int min = i;

        if(hasLeft(i) && heap[left].compareTo(heap[min])<0) { //IMPORTANT compare with heap[min] NOT heap[i]
            min = left;
        }
        if(hasRight(i) && heap[right].compareTo(heap[min])<0) 
            min = right;

        if (min !=i) {
            swap(i,min);
            bubbleDown(min);
        }

        }

        public MaintenanceRequest peek() {
            if(isEmpty()) return null;
            return heap[0];
        }

        public void display() {
            if(isEmpty()){ 
                System.out.println("no requests");
                return;
            }
            MinHeap temp = new MinHeap(capacity);
            for(int i=0; i<size;i++) {
                temp.insert(heap[i]);
            }

            System.out.println("REQUESTS STORED:");
            int pos=1;
            while(!temp.isEmpty()) {
                System.out.println(pos+": "+ temp.removeMin());
                pos++;
            }
        }

        public void update(int id, int newPriority) {
            int index=-1;
            for(int i=0;i<size;i++) {
                if(heap[i].getRequest()==id) {
                    index=i;
                    break;
                }
            }
            int old = heap[index].getPriority(); //important, you have to store the old priority before you set the new one so yk how to reorder the heap
            heap[index].setPriority(newPriority);

            if(index==-1) System.out.println("NOT FOUND");

            else if(old>newPriority) {
                bubbleUp(index);
                System.out.println("UPDATED SUCCESSFULY");
            } else{
                bubbleDown(index);
                System.out.println("UPDATED SUCCESSFULY");
            }
        }

    }