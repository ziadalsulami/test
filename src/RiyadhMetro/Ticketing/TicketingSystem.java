package RiyadhMetro.Ticketing;

public class TicketingSystem {
    Queue[] machines;
    Queue[] vipMachines; //task 1: vip track, tricky to serve
    int numOfMachines;
    int numOfServed;

    public TicketingSystem() {
        numOfMachines=5;
        machines= new Queue[numOfMachines];
        vipMachines= new Queue[numOfMachines];

        for(int i=0;i<5;i++) {
            machines[i] = new Queue();
            vipMachines[i] = new Queue();
        }
        numOfServed=0;

    }

    public void addPassenger(int num, String name ){
        machines[num-1].enqueue(new Passenger(name));

        System.out.println(name + " is in line for machine no. "+num);
    }

    public void addVIP(int num, String name) {
        vipMachines[num-1].enqueue(new Passenger(name));
        System.out.println(name + " is in line for VIP machine no. "+num);

    }

    public void serve(int num){

        Passenger p;
        if(!vipMachines[num-1].isFree()) {
            p = vipMachines[num-1].dequeue();
        }
        else{
            p= machines[num-1].dequeue();
        }

        if(p==null) System.out.println("machine "+num+" is empty");
        else{System.out.println("served "+p.getName()+" successfuly");}
        numOfServed++;
    }

    public void peekNext(int num) {
        Passenger p= machines[num-1].peek();
        if(p==null) System.out.println("machine "+num+" is empty");
        else System.out.println("next at machine no."+num+" is "+p.getName());
    }
    public void displayWaiting() {
        System.out.println("---ALL WAITING PASSENGERS---");
        for(int i=0;i<numOfMachines;i++) {
            System.out.println("___MACHINE "+(i+1)+"___:");
            machines[i].display();
               
        }

    }

    public void displayWaitingCounts (){
            System.out.println("--ALL WAITING COUNTS--");

            for(int i=0;i<numOfMachines;i++) {
            System.out.print("MACHINE "+(i+1)+": ");
            machines[i].getSize();   
        }
    }

    public void avgWaitingTime() {
        int total =0;
        int time=0;
        for(int i=0;i<numOfMachines;i++) {
            total=total+machines[i].getSize();

            for(int j=1; j<=machines[i].getSize();j++) {
                time=time+j;
            }
        }
        if (total==0) System.out.print("Machines are empty, waiting time is 0");
        else{
        double avgTime = (time*2)/total;
        System.out.println("average waiting time is: "+avgTime+" minutes.");
        }
    }
//task 2: find estimated time, tricky to find the passenger
    public void estimateTime(String name) {
        boolean found=false;
        for(int i=0;i<numOfMachines;i++) {
            int pos = machines[i].find(name);
            if(pos!=-1){
                found=true;
                int time = (pos-1)*2;
                System.out.println("Estimated waiting time is: "+time+" mins");
                return;
            }
                
            }
            if(found==false) System.out.println("not found");
        }

        public void move(String name, int num1, int num2) {
        Passenger p;
        boolean found=false;
        QueueNode curr = machines[num1-1].front;
        while(curr!=null) {
            if(curr.passenger.getName().equals(name)) {
                p=curr.passenger;
                found=true;
                machines[num2-1].enqueue(p);
                machines[num1-1].dequeue();
                System.out.println(name+ " was moved from machine no."+num1+" to machine no."+num2);
                return;

            }
            curr=curr.next;

            }
        
        if(found==false) System.out.println(name+" NOT FOUND IN MACHINE NO."+num1);
       
        }



    }




