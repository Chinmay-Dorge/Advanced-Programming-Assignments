package Threads;
public class FirstThread extends Thread {
    public Object obj;
    public FirstThread(Object obj){
        this.obj = obj;
    }
    public void run(){
        synchronized (obj){
            System.out.println("Executing FirstThread");
            System.out.println("FirstThread will wait for SecondThread");
            try {
                obj.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("FirstThread completed");
            obj.notifyAll();
        }

    }
}