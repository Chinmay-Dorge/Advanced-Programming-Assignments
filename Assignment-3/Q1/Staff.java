import java.util.Scanner;
public class Staff extends Student{
    Scanner sc = new Scanner(System.in);
    private String work;

    public void takeInput(){
        System.out.print("Enter Staff's name: ");
        name = sc.nextLine();
        System.out.print("Enter Staff's work: ");
        work = sc.nextLine();
    }
    public void displayData(){
        System.out.println("Staff's name: " + name);
        System.out.println("Staff's work: " + work);
    }
}