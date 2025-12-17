package RiyadhMetro.Ticketing;
import java.time.LocalTime;
public class Passenger {

    private static int IDcounter;
    private int ID;
    private String name;
    private LocalTime time;
    public static int getIDcounter() {
        return IDcounter;
    }
    public static void setIDcounter(int iDcounter) {
        IDcounter = iDcounter;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public Passenger(String name) {
        ID = IDcounter++;
        this.name = name;
        this.time = LocalTime.now();
    }
    @Override
    public String toString() {
        return "Passenger #" + ID + ": name:" + name + " arrived:" + time;
    }
    

    



}
