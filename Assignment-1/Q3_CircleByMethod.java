import java.util.Scanner;

class Circle{
    float radius;

    public void getRadius(float a){
        radius = a;
    }
    public void calculateArea(){
        System.out.println("Area of circle = " + (3.14f * radius * radius));
    }
}

public class Q3_CircleByMethod {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();

        System.out.print("Enter radius: ");
        float r = sc.nextFloat();

        c1.getRadius(r);
        c1.calculateArea();
    }
}