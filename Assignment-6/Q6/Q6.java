class Thread1 extends Thread {
    public void run() {
        System.out.println("Shutdown hook 1 completing task....");
    }
}
class Thread2 extends Thread {
    public void run() {
        System.out.println("Shutdown hook 2 completing task....");
    }
}
class Thread3 extends Thread {
    public void run() {
        System.out.println("Shutdown hook 3 completing task....");
    }
}
public class Q6 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new Thread1());
        r.addShutdownHook(new Thread2());
        r.addShutdownHook(new Thread3());
        System.out.println("Main is sleeping.... Press Ctrl-c to exit");
        try
        {
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}