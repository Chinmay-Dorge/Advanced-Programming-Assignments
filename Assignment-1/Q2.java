//Write three parameterized constructors for adding two operands, three operands and four operands, respectively in the Addition class and called them with from a main class with three objects.
import java.util.Scanner;

class Addition{
    int a = 0 , b = 0 , c = 0, d = 0;
    Addition(int input1 , int input2){
        a = input1; b = input2;
        System.out.println(a+b);
    }
    Addition(int input1 , int input2, int input3){
        a = input1; b = input2; c = input3;
        System.out.println(a+b+c);
    }
    Addition(int input1 , int input2, int input3, int input4){
        a = input1; b = input2; c = input3; d = input4;
        System.out.println(a+b+c+d);
    }

}

public class Q2{
    public static void main(String arg[]){
        Addition a1 = new Addition(3,4);
        Addition a2 = new Addition(3,4,5);
        Addition a3 = new Addition(3,4,5,6);
    }
}