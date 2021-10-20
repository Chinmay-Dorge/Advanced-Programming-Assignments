package Threads;
public class SecondThread extends Thread {
    public Object obj;
    public SecondThread(Object obj){
        this.obj = obj;
    }
    public void run(){
        synchronized (obj){
            System.out.println("Executing Second Thread");
            System.out.println("SecondThread will wait for ThirdThread");
            try{
                obj.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("SecondThread completed");
            obj.notify();
        }
    }
}