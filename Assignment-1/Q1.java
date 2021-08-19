// Write a Java code for designing a simple calculator with five arithmetic operators (addition, subtraction, multiplication, division, and modulo) and three logical operators (and, or, and not).

import java.util.Scanner;
public class Q1{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number next to the operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. AND");
        System.out.println("6. OR");
        System.out.println("7. NOT");
        int input = sc.nextInt();
        if(input == 1){
            System.out.println("Enter 2 numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum = " + (a+b));
        }
        else if(input == 2){
            System.out.println("Enter 2 numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Difference = " + (a-b));
        }
        else if(input == 3){
            System.out.println("Enter 2 numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Product = " + (a*b));
        }
        else if(input == 4){
            System.out.println("Enter 2 numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b==0){
                System.out.println("Denominator cannot be zero");
            }
            else{
                System.out.println("Division = " + (a/b));
            }
        }
        else if(input == 5){
            System.out.println("Enter 2 boolean values (true or false)");
            boolean a = sc.nextBoolean();
            boolean b = sc.nextBoolean();
            System.out.println("Logical AND = " + (a & b));
        }
        else if(input == 6){
            System.out.println("Enter 2 boolean values (true or false)");
            boolean a = sc.nextBoolean();
            boolean b = sc.nextBoolean();
            System.out.println( "Logical OR = " + (a | b));
        }
        else if(input == 7){
            System.out.println("Enter a boolean value (true or false)");
            boolean a = sc.nextBoolean();
            System.out.println("Logical NOT = " + (!a));
        }
        else{
            System.out.println("Enter valid number");
        }
    }
}