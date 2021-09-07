package citizen;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1");
        System.out.println("-----------------------------");
        System.out.println();
            System.out.print("Enter name: ");
            String n = sc.nextLine();
            System.out.print("Enter Aadhar Card number: ");
            String a = sc.next();
            System.out.print("Enter mobile number: ");
            String m = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            Vaccine v = new Vaccine(n,a,m,age);
            try{
                v.verifyAge();
            }catch(Exception e){
                System.out.println(e);
            }


    }
}