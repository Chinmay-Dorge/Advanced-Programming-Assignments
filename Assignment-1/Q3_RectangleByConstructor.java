import java.util.Scanner;

class Rectangle{
    float length;
    float breadth;
    Rectangle(float a , float b){
        length = a;
        breadth = b;
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

public class Q3_RectangleByConstructor{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float a = sc.nextFloat();
        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();

       Rectangle b2 = new Rectangle(a,b);

    }
}