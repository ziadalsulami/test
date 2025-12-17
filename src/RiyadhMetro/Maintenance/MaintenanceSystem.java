package RiyadhMetro.Maintenance;
//BONUS ADD-ON: View All Requests of a Specific Priority do later

public class MaintenanceSystem {
    private MinHeap heap;

    public MaintenanceSystem() {
        heap = new MinHeap(100);
    }

    public void submitRequest(String descreption, int priority) {
        heap.insert(new MaintenanceRequest(descreption, priority));
        System.out.println(descreption+" was submitted");
    }

    public void assign() {
        MaintenanceRequest req = heap.removeMin();
        if(req==null) System.out.println("NO REQUESTS");
        else System.out.println(req+" assigned successfuly");
    }

    public void viewCritical() {
        if(heap.isEmpty()) System.out.println("NO REQUESTS");
        else System.out.println("MOST CRITICAL: "+ heap.peek());
    }

    public void display() {
        System.out.println("---------------");
        heap.display();
    }
    public void update(int id, int priority ) {
        heap.update(id, priority);
    }

    public void workload() {
        int[] workload = new int[5];
        MaintenanceRequest[] temp = new MaintenanceRequest[heap.getSize()];
        int i=0;
        while(!heap.isEmpty()) {
            MaintenanceRequest req = heap.removeMin();
            temp[i] = req;
            workload[req.getPriority()]++; //999 IQ what the fuck? increase workload at index (priority level) by 1 each time its found
            i++;
        }
        for(int j=0;j<temp.length;j++) {
            heap.insert(temp[j]);
        }
        for(int k=1; k<workload.length;k++) {
            System.out.println("LEVEL: "+k+" WORKLOAD:"+workload[k]+" requests");  
        }
        }
}