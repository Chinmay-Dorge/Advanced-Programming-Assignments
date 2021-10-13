class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        for(int i = 0; i < 1000000000; i++) {}
        System.out.println(Thread.currentThread().getName() + " is terminating...");
    }
}

class DaemonRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        for(int i = 0; i < 1000000000; i++) {
            System.out.println("Daemon Thread iteration number = " + i);
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        DaemonRunnable daemonRunnable = new DaemonRunnable();
        
        Thread daemon = new Thread(daemonRunnable, "daemon");
        daemon.setDaemon(true);
        
        Thread t1 = new Thread(myRunnable, "t1");
        Thread t2 = new Thread(myRunnable, "t2");
        
        t1.start();
        t2.start();
        daemon.start();
        
        System.out.println("State of daemon: " + daemon.getState());
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("State of t1: " + t1.getState());
        System.out.println("State of t2: " + t2.getState());

        System.out.println("The Daemon Thread iteration was not complete as it is a Daemon thread ");
    }
}