public class Q5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                System.out.println("interrupted first thread");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        this.wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("interrupted second thread");
                }
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                System.out.println("interrupted returned " + Thread.interrupted());
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        this.wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("interrupted returned " + Thread.interrupted());
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("interrupting first thread:");
        t1.interrupt();
        System.out.println("t1.isInterrupted() = " + t1.isInterrupted());
        System.out.println();
        System.out.println("interrupting second thread:");
        t2.interrupt();
        System.out.println("t2.isInterrupted() = " + t2.isInterrupted());
        System.out.println();
        System.out.println("interrupting third thread:");
        t3.interrupt();
        System.out.println("t3.isInterrupted() = " + t3.isInterrupted());
        System.out.println();
        System.out.println("interrupting fourth thread:");
        t4.interrupt();
        System.out.println("t4.isInterrupted() = " + t4.isInterrupted());

    }
}