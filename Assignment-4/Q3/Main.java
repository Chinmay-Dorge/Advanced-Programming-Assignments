package Main;
import pack.*;
class Print{
    private static class Ticket{
        void print(){
            System.out.println("----------TICKET----------");
        }
    }
    void PrintTicket(){
        Ticket t=new Ticket();
        t.print();
    }
    protected static class HappyJourney{
        void print_hj(){
            System.out.println("Happy Journey :)");
            System.out.println("--------------------------");
        }
    }
    void PrintHappyJourney() {
        HappyJourney hj = new HappyJourney();
        hj.print_hj();
    }

}
public class Main{
    public static void main(String[] args) {
        A objA=new A();
        C objC=new C();
        Print p=new Print();
        objC.InputDetails(objA);
        p.PrintTicket();
        System.out.println("Name: "+objA.getName());
        System.out.println("Train: "+objC.getTrainName());
        System.out.println("From: "+objA.getStart());
        System.out.println("To: "+objA.getStop());
        System.out.println("Seat No: "+objC.getSeatNo());
        System.out.println("Total time: "+objA.getTotalTime());
        System.out.println("Cost: "+objC.getCost()+"₹");
        p.PrintHappyJourney();
    }
}
