package RiyadhMetro.StationSearch;
import java.util.Scanner;
public class StationDirectory {

    private BST bst;
    public StationDirectory() {
        bst = new BST();
        intialize();
    }
    private void intialize(){
        bst.insert(1001, new StationInfo(1001, "Makkah Road", "طريق مكة", "Orange"));
        bst.insert(1002, new StationInfo(1002, "Prince Turki", "الأمير تركي", "Orange"));
        bst.insert(1003, new StationInfo(1003, "Education City", "المدينة التعليمية", "Orange"));
        bst.insert(1004, new StationInfo(1004, "Hittin", "حطين", "Orange"));
        bst.insert(1005, new StationInfo(1005, "Khurais", "الخريص", "Orange"));
        
        // Line 2 (Yellow)
        bst.insert(2001, new StationInfo(2001, "Riyadh Park", "الرياض بارك", "Yellow"));
        bst.insert(2002, new StationInfo(2002, "King Salman Park", "حديقة الملك سلمان", "Yellow"));
        bst.insert(2003, new StationInfo(2003, "Sports Boulevard", "بوليفارد الرياضة", "Yellow"));
        bst.insert(2004, new StationInfo(2004, "Western Ring Road", "الطريق الدائري الغربي", "Yellow"));
        
        // Line 3 (Green)
        bst.insert(3001, new StationInfo(3001, "Riyadh Zoo", "حديقة حيوان الرياض", "Green"));
        bst.insert(3002, new StationInfo(3002, "Malaz", "الملز", "Green"));
        bst.insert(3003, new StationInfo(3003, "Imam Saud University", "جامعة الإمام سعود", "Green"));
        bst.insert(3004, new StationInfo(3004, "Eastern Ring Road", "الطريق الدائري الشرقي", "Green"));
    }

    public void add(int id, String nameE, String nameAa, String metroLines) {
        StationInfo s = new StationInfo(id, nameE, nameAa, metroLines);
        bst.insert(id, s);
        System.out.println("STATION: "+nameE+ " WAS ADDEDD");
    }

    public void search(int id) {
        StationInfo s = bst.search(id);
        if(s==null) System.out.println("STATION WITH ID #"+id+" WAS NOT FOUND");
        else { 
            System.out.println("STATION FOUND:");
            System.out.println(s);
        }

    }

    public void findRange(int min, int max){
    bst.findRange(min,max);
    }

    public void remove(int key) {
        StationInfo info = bst.delete(key);
        if(info==null) System.out.println("STATION NOT FOUND");
        else System.out.println("STATION "+ info.getNameE()+" WAS REMOVED SUCCESSFULY");

    }

    public void display() {
        System.out.println("---ALL STATIONS SORTED---");
        bst.display();
    }

        public void update(int id) {
            StationInfo station = bst.search(id);
            if(station==null) System.out.println("STATION WITH ID #"+id+" WAS NOT FOUND");
            else {
                

            }

        
    }





}