import java.util.Scanner;
public class Teacher extends Student{
    Scanner sc = new Scanner(System.in);
    private String areaOfTeaching;

    public void takeInput(){
        System.out.print("Enter Teacher's name: ");
        name = sc.nextLine();
        System.out.print("Enter Teacher's area of teaching: ");
        areaOfTeaching = sc.nextLine();
    }

    public void displayData(){
        System.out.println("Teacher's name " + name);
        System.out.println("Teacher's area of teaching " + areaOfTeaching);
    }

    public class Science{
        private int numberOfStudents;
        void takeInput(){
            System.out.println("Enter number of students for Science stream: ");
            numberOfStudents = sc.nextInt();
        }
        void displayData(){
            System.out.println("Number of students for Science = " + numberOfStudents);
        }
    }

    public class Arts{
        private int numberOfStudents;
        void takeInput(){
            System.out.println("Enter number of students for Arts stream: ");
            numberOfStudents = sc.nextInt();
        }
        void displayData(){
            System.out.println("Number of students for Arts = " + numberOfStudents);
        }
    }

    public class Commerce{
        private int numberOfStudents;
        void takeInput(){
            System.out.println("Enter number of students for Commerce stream: ");
            numberOfStudents = sc.nextInt();
        }
        void displayData(){
            System.out.println("Number of students for Commerce = " + numberOfStudents);
        }
    }
}