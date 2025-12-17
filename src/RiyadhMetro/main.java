package RiyadhMetro;

import RiyadhMetro.Maintenance.MaintenanceSystem;
import RiyadhMetro.StationSearch.StationDirectory;
import RiyadhMetro.Ticketing.TicketingSystem;

public class main {
    public static void main(String[]args) {
        TicketingSystem system = new TicketingSystem();
        System.out.println("this is an edit");
        System.out.println("another one");
        System.out.println("I SIAD ANOTHER ONE");


        // system.addPassenger(1, "p1");
        // system.addPassenger(1, "p2");
        // system.addPassenger(1, "p3");
        // system.addPassenger(2, "p4");
        // system.addPassenger(2, "p5");
        // system.addVIP(1, "pVIP");

        // System.out.println("_________before serving 1:_______");

        // system.displayWaiting();
        // // system.move("p1", 1, 5);
        // // system.displayWaiting();
        // System.out.println("________after serving 1:_______");
        // system.serve(1);
        // system.displayWaiting();

        // MaintenanceSystem m = new MaintenanceSystem();
        // m.submitRequest("paint", 4);
        // m.submitRequest("oil", 2);
        // m.submitRequest("bomb", 1);
        // m.submitRequest("fire", 1);

        // m.submitRequest("trash", 4);
        // m.submitRequest("crowd", 3);
        // m.workload();

        StationDirectory s = new StationDirectory();
        s.display();

        // m.assign();
        // m.assign();
        // m.display();
        // m.update(1, 3);
        // m.display();
        // m.viewCritical();
        

    }

}
