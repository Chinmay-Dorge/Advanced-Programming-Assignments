public class Q1 {
    Integer i = 0;
    synchronized int count1() {
        i++;
        return i;
    }

    int count2 () {
        synchronized (i) {
            i += 2;
        }
        return i;
    }

    public static void main(String[] args) {
        var obj = new Q1();
        Runnable r1 = new Runnable() {
            public void run(){
                System.out.println(obj.count1());
            }
        };
        Runnable r2 = new Runnable() {
            public void run(){
                System.out.println(obj.count2());
            }
        };
        Thread a = new Thread(r1);
        Thread b = new Thread(r1);
        Thread c = new Thread(r2);

        try {
            a.start();
            Thread.sleep(20);
            b.start();
            Thread.sleep(20);
            c.start();
            Thread.sleep(20);
            a.join();
            b.join();
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}