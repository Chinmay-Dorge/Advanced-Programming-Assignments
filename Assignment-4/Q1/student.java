package MCA;
public class student{
    public int rollNumber;
    public String Name;
    private int marks1 , marks2 , marks3;
    private int sum ;
    private double percentage;
    public student(int roll , String name , int m1 , int m2 , int m3){
        rollNumber = roll;
        Name = name;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
        sum = m1 + m2 + m3;
        double temp = sum;
        percentage = ((temp)/300d)*100d;
    }
    public void display(){
        System.out.println("Student's Roll Number = " + rollNumber);
        System.out.println("Student's Name = " + Name);
        System.out.println();
        System.out.println("Student's Marks for the 3 subjects: ");
        System.out.println("Subject 1 = " + marks1);
        System.out.println("Subject 2 = " + marks2);
        System.out.println("Subject 3 = " + marks3);
        System.out.println();
        System.out.println("Total marks = " + sum);
        System.out.println("Percentage = " + percentage);
    }
}