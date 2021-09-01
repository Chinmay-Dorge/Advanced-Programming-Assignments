package B;
import A.Travel;//use of package.classname

import java.util.Scanner;
//use of abstract class
abstract class Period{
    abstract void setPeriod(String s);
}
//use of inheritance
class Tour extends Period{
    String period,Hotel;

    public void setPeriod(String s){
        this.period=s;
    }
    public String getPeriod() {
        return period;
    }
    public void hotelAvailability(String s){
        this.Hotel=s;
    }
    public String getHotel() {
        return Hotel;
    }

}
class InputDetails{
    public void Input(Travel objA,Tour objB){
        Scanner sc=new Scanner(System.in);
        String p,a,d,date;
        System.out.println("Enter Date: ");
        date= sc.nextLine();
        objA.setDate(date);
        System.out.println("Enter Period: ");
        p=sc.nextLine();
        objB.setPeriod(p);
        System.out.println("Enter Destination: ");
        d=sc.nextLine();
        objA.setDestination(d);
        System.out.println("Enter nearby hotel availability: ");
        a=sc.nextLine();
        objB.hotelAvailability(a);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Travel objA=new Travel();
        InputDetails i=new InputDetails();
        Tour objB=new Tour();
        i.Input(objA,objB);

        System.out.println("Alright so, Lets look out for what all we have got in this the tour");
        System.out.println("Date Decided to travel: "+objA.getDate());
        System.out.println("Period at which we will be ready to begin our journey: "+objB.getPeriod());
        System.out.println("Destination planned: "+objA.getDestination());
        System.out.println("Availability of nearby hotels to stay: "+objB.getHotel());
        System.out.println("Make sure you have fun in this tour, by enjoying every moment :)");
    }
}