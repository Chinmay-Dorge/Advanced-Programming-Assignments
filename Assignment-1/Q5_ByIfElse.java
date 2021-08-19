import java.util.Scanner;
public class Q5_ByIfElse{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = a , min = a;
        if(b>max){
            max=b;
        }
        else if(b<min){
            min=b;
        }
        if(c>max){
            max=c;
        }
        else if(c<min){
            min=c;
        }
        if(d>max){
            max=d;
        }else if(d<min){
            min=d;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}