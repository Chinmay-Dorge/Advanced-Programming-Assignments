import java.util.Scanner;
public class Q5_ByTernary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = (a > b && a > c && a > d) ? a: ((b > c && b > d) ? b : (c > d ? c : d));
        int min = (a < b && a < c && a < d) ? a: ((b < c && b < d) ? b : (c < d ? c : d));
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}