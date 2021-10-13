package dataprocess;

public class BgSYNCThread extends Thread {
    public BgSYNCThread(ThreadGroup tg, String name) {
        super(tg, name);
    }
    public void run() {
        System.out.println("Syncing all the data of the app with the cloud");
        for(int i = 0; i < 1000000000; i++);
    }    
}