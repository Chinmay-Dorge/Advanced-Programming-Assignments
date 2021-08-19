import java.util.Scanner;

class Rectangle{
    float length;
    float breadth;

    public void getData(float a,float b){
        length = a;
        breadth = b;
    }
    public void calculateArea(){
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

public class Q3_RectangleByMethod {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();

        System.out.print("Enter length: ");
        float l = sc.nextFloat();
        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();

        r1.getData(l,b);
        r1.calculateArea();
    }
}