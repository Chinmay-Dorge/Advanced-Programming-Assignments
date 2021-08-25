import java.util.Scanner;
public class main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        arithmetic ans = new arithmetic();
        System.out.println("Addition = " + ans.addition(a,b));
        System.out.println("Subtraction = " + ans.subtraction(a,b));
        System.out.println("Multiplication = " + ans.multiplication(a,b));
        System.out.println("Division = " + ans.division(a,b));
    }
}