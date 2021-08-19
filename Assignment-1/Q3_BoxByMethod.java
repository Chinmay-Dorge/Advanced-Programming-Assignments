//Write a Java program to find the volume of three different types of Boxes while taking height, width, and depth as inputs. Write two separate programs using the help of methods and parameterized constructors. Similarly, write the Java programs to find the area of a circle and rectangle.
import java.util.Scanner;

class Box{
    float height;
    float width;
    float depth;

    public void getData(float a,float b , float c){
        height = a;
        width = b;
        depth = c;
    }
    public void calculateVolume(){
        System.out.println("Volume of box = " + (height*width*depth));
    }
}

public class Q3_BoxByMethod {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Box b1 = new Box();

        System.out.print("Enter height: ");
        float h = sc.nextFloat();
        System.out.print("Enter width: ");
        float w = sc.nextFloat();
        System.out.print("Enter depth: ");
        float d = sc.nextFloat();

        b1.getData(h,w,d);
        b1.calculateVolume();
    }
}