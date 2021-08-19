public class Q8 {
    static void Fibonacci(){
        int a=0,b=1;
        System.out.println(a);
        while(b<=100){
            System.out.println(b);
            int temp = b;
            b += a;
            a = temp;
        }

    }
    public static void main(String arg[]){
        System.out.println("Fibonacci series upto 100 is as follows ");
        Fibonacci();
    }
}