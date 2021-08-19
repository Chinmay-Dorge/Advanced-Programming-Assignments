class Multiply{
    Multiply(int a , int b){
        int ans = a*b;
        System.out.println("Product of 2 integers = " + ans );
    }
    Multiply(double a , double b){
        double ans = a*b;
        System.out.println("Product of 2 doubles = " + ans );
    }
    Multiply(int a , int b , int c){
        int ans = a*b*c;
        System.out.println("Product of 3 integers = " + ans);
    }
}
public class Q7_constructor{
    public static void main(String args[]){
        Multiply m1 = new Multiply(3,4);
        Multiply m2 = new Multiply(3.2 , 5.5);
        Multiply m3 = new Multiply(8,5,2);
    }
}