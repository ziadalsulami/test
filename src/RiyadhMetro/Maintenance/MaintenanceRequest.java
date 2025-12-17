package RiyadhMetro.Maintenance;
import java.time.LocalTime;

public class MaintenanceRequest implements Comparable<MaintenanceRequest>{
    public static int IDcounter=0;
    private int request;
    private String descreption;
    private int priority;
    private LocalTime time;

    public MaintenanceRequest(String descreption, int priority) {
        this.descreption = descreption;
        this.priority = priority;
        request=IDcounter++;
        this.time = LocalTime.now();
        
    }

    public int getRequest() {
        return request;
    }

    public void setRequest(int request) {
        this.request = request;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPriorityString() {
        switch(priority) {
            case 1: return "CRITICAL";
            case 2: return "HIGH";
            case 3: return "MEDIUM";
            case 4: return "LOW";
            default: return "UNKOWN";
        }
    }

    @Override
    public String toString() {
        return "Request #" + request + " descreption: " + descreption + " priority:" + getPriorityString()
                + " time: " + time;
    }

    @Override
    public int compareTo(MaintenanceRequest o) {
        if(this.priority != o.priority) return this.priority - o.priority;
        return this.time.compareTo(o.time);
    }


    

    


}
