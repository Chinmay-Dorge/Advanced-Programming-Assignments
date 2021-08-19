public class Q6{
    public static void main(String arg[]){
        int z = 8;
        int a = z++ + ++z;
        int b = z-- + --z;
        int c = z++;
        int d = ++z;
        int e = z--;
        int f = --z;
        System.out.println("Value of z before operations = " + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("Value of z after operations = " + z);
    }
}