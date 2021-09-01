package pack;

import java.util.Scanner;

interface Journey{
    void setStart();
    void setStop();
    void setTotalTime();
}
public class A implements Journey{
    private String name,Bplace,Tplace,time;

    Scanner sc=new Scanner(System.in);
    public void setName(String s){
        this.name=s;
    }
    public String getName(){
        return name;
    }
    public void setStart(){
        System.out.println("Enter beginning place of journey: ");
        Bplace=sc.nextLine();
    }
    public String getStart(){
        return Bplace;
    }
    public void setStop(){
        System.out.println("Enter terminating place of journey: ");
        Tplace=sc.nextLine();
    }
    public String getStop(){
        return Tplace;
    }
    public void setTotalTime(){
        System.out.println("Enter total time of journey: ");
        time=sc.nextLine();
    }
    public String getTotalTime(){
        return time;
    }
}