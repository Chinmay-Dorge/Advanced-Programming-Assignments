import java.util.Scanner;

class Box{
    float height;
    float width;
    float depth;
    Box(float h , float w , float d){
        height = h;
        width = w;
        depth = d;
        System.out.println("Volume of box = " + (height*width*depth));
    }
}

public class Q3_BoxByConstructor{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        float a = sc.nextFloat();
        System.out.print("Enter width: ");
        float b = sc.nextFloat();
        System.out.print("Enter depth: ");
        float c = sc.nextFloat();

        Box b2 = new Box(a,b,c);

    }
}