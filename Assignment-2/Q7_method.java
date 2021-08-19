class methodOverloading{
    public void multiply(int a , int b){
        int ans = a*b;
        System.out.println("Product of 2 integers = " + ans);
    }
    public void multiply(double a , double b){
        double ans = a*b;
        System.out.println("Product of 2 doubles " + ans);
    }
    public void multiply(int a , int b , int c){
        int ans = a*b*c;
        System.out.println("Product of 3 integers = " + ans);
    }
}

public class Q7_method{
    public static void main(String arg[]){
        methodOverloading m = new methodOverloading();
        m.multiply(3,4);
        m.multiply(3.2 , 5.5);
        m.multiply(8,5,2);
    }
}