class Mobile{
    public String userName;
    private int cost;
    private String camera;
    Mobile(String userName , int cost , String camera){
        this.userName = userName;
        this.cost = cost;
        this.camera = camera;
    }
    void printData(){
        System.out.println("Username = " + userName + ", Cost = " + cost + ", Camera = " + camera);
    }
}
public class Q3{
    public static void main(String args[]){
        Mobile m1 = new Mobile("SteveJobs" , 100500 , "Apple");
        Mobile m2 = new Mobile("LinusTorvalds" , 75000 , "OnePlus");
        Mobile m3 = new Mobile("JeffBezos" , 50000 , "Samsung");

        m1.printData();
        m2.printData();
        m3.printData();
    }
}