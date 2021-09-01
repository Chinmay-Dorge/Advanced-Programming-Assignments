import java.util.Scanner;
import MCA.student;
public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's following details ");
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Roll number: " );
        int roll = sc.nextInt();

        System.out.println("Enter marks of following subject (maximum marks for each is 100)");
        System.out.print("Subject 1: ");
        int a = sc.nextInt();
        System.out.print("Subject 2: ");
        int b = sc.nextInt();
        System.out.print("Subject 3: ");
        int c = sc.nextInt();

        student s = new student(roll , n , a , b ,c);

        s.display();
    }
}