import java.util.Scanner;

class Circle{
    float radius;
    Circle(float a){
        radius = a;
        System.out.println("Area of Circle = " + (3.14f * radius * radius));
    }
}

public class Q3_CircleByConstructor{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();

        Circle c2 = new Circle(r);

    }
}