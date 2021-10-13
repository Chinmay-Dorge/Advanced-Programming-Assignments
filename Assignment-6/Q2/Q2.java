public class Q2 {
    public static void main(String[] args) {
        Thread sania = new Thread() {
            public void run() {
                System.out.println("Sania is running and will now sleep for 100ms");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                System.out.println("Calling yield() on Sania");
                Thread.yield();
                System.out.println("Sania will now stop");
            }
        };
        Thread maria = new Thread() {
            public void run() {
                System.out.println("Maria is running and will now sleep for 200ms");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Maria will now stop");
            }
        };
        Thread serena = new Thread() {
            public void run() {
                System.out.println("Serena is running and will now sleep for 300ms");
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Serena will now stop");
            }
        };

        sania.setPriority(Thread.MAX_PRIORITY);
        maria.setPriority(Thread.NORM_PRIORITY);
        serena.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Priority of Sania: " + sania.getPriority());
        System.out.println("Priority of Maria: " + maria.getPriority());
        System.out.println("Priority of Serena: " + serena.getPriority());
        System.out.println();

        System.out.println("Calling run() on Sania");
        sania.run();
        System.out.println();

        System.out.println("Calling start() on Maria");
        maria.start();
        System.out.println();

        System.out.println("Calling suspend() on Maria");
        maria.suspend();
        System.out.println();

        System.out.println("Calling start() on Serena");
        serena.start();
        System.out.println();

        try {
            System.out.println("Calling join() on Serena");
            serena.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Calling resume() on Maria");
        maria.resume();
        System.out.println();
    }
}
