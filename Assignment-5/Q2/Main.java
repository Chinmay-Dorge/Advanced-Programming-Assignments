import Q2.sum;
import Q2.min;
import java.util.Scanner;
public class Main {

    static float func(int[] arr , int sum , int min) throws Exception{
        if(min == 0){
            throw new Exception("Cannot divide by 0");
        }
        float a = (float)sum / (float)min;
        return a;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.print("Enter 5 enumbers: ");
        for(int i=0 ; i<5; i++){
            a[i] = sc.nextInt();
        }
        min m1 = new min();
        sum s1 = new sum();

        try{
            float ans = func(a , s1.getSum(a) , m1.getMin(a));
            System.out.println("Min = " + m1.getMin(a));
            System.out.println("Sum = " + s1.getSum(a));
            System.out.println("Ans = " + ans);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}