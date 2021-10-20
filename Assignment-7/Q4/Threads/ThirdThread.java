package Threads;
public class ThirdThread extends Thread{
    public Object obj;
    public ThirdThread(Object obj){
        this.obj = obj;
    }
    public void run(){
        synchronized (obj){
            System.out.println("Executing Third Thread");
            obj.notify();
            System.out.println("ThirdThread completed");
        }
    }
}