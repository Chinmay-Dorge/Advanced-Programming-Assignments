import java.util.Scanner;
public class Q5{
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number next to the shape: ");
       System.out.println("1. Circle ");
       System.out.println("2. Pentagon");
       System.out.println("3. Triangle");
       System.out.println("4. Square");
       System.out.println("5. Rectangle");
       int input = sc.nextInt();
       switch(input){
           case 1:
               System.out.print("Enter length of radius: ");
               double radius = sc.nextInt();
               System.out.println("Area = " + (radius*radius*(3.14)));
               break;
           case 2:
               System.out.print("Enter length of side (Regular Pentagon): ");
               double p = sc.nextInt();
               double area_p = (0.25)*(Math.sqrt(5*(5+(2*Math.sqrt(5)))))*(p*p);
               System.out.println("Area = " + area_p);
               break;
           case 3:
               System.out.print("Enter length of base: ");
               double base = sc.nextInt();
               System.out.print("Enter length of height: ");
               double height = sc.nextInt();
               System.out.println("Area = " + (0.5 * base * height));
               break;
           case 4:
               System.out.print("Enter length of side: ");
               double side = sc.nextInt();
               System.out.println("Area = " + (side * side));
               break;
           case 5:
               System.out.print("Enter length: ");
               double length = sc.nextInt();
               System.out.print("Enter breadth: ");
               double breadth = sc.nextInt();
               System.out.println("Area = " + (length * breadth));
               break;
           default:
               System.out.println("Wrong input....Try again ");
       }
   }
}