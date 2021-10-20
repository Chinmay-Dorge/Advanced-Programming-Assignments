import Threads.FirstThread;
import Threads.SecondThread;
import Threads.ThirdThread;
public class Q4 {
    public static void main(String[] args) {
        Object obj = new Object();
        FirstThread thread1 = new FirstThread(obj);
        SecondThread thread2 = new SecondThread(obj);
        ThirdThread thread3 = new ThirdThread(obj);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread3.join();
            Thread.sleep(100);
            thread1.interrupt();
            thread2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
