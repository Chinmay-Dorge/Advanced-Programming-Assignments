package pack;
import java.util.Scanner;

public class C extends B {
    private int seat_no;
    public void setSeatNo(int i){
        this.seat_no=i;
    }
    public int getSeatNo(){
        return seat_no;
    }

    public void InputDetails (A objA){
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int u, v;
        System.out.println("Enter your name: ");
        s1 = sc.nextLine();

        objA.setName(s1);
        System.out.println("Enter train name: ");
        s2 = sc.nextLine();
        setTrainName(s2);
        System.out.println("Enter seat no.: ");
        u = sc.nextInt();
        setSeatNo(u);
        objA.setStart();
        objA.setStop();
        objA.setTotalTime();
        System.out.println("Enter cost: ");
        v = sc.nextInt();
        SetCost(v);
        System.out.println();
    }

}