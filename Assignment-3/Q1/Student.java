import java.util.Scanner;
public class Student{
    Scanner sc = new Scanner(System.in);
    protected String name;
    private int rollNumber;
    private long mobileNumber;


    public void takeInput(){
        System.out.print("Enter Student's name: ");
        name = sc.nextLine();
        System.out.print("Enter Student's roll number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter Student's mobile number: ");
        mobileNumber = sc.nextLong();
    }

    public void displayData(){
        System.out.println("Student's name: " + name);
        System.out.println("Student's roll number: " + rollNumber);
        System.out.println("Student's mobile number: " + mobileNumber);
    }

}