class SaniaRunnable implements Runnable {
    public void run() {
        System.out.println("Sania is running and will now sleep for 100ms");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Calling yield() on Sania");
        Thread.yield();
        System.out.println("Sania will now stop");
    }
}

class MariaRunnable implements Runnable {
    public void run() {
        System.out.println("Maria is running and will now sleep for 200ms");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Maria will now stop");
    }
}

class SerenaRunnable implements Runnable {
    public void run() {
        System.out.println("Serena is running and will now sleep for 300ms");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Serena will now stop");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Thread sania = new Thread(new SaniaRunnable());
        Thread maria = new Thread(new MariaRunnable());
        Thread serena = new Thread(new SerenaRunnable());

        sania.setPriority(5);
        maria.setPriority(5);
        serena.setPriority(5);

        System.out.println("Calling run() on Sania");
        System.out.println("Priority of Sania: " + sania.getPriority());
        sania.run();
        System.out.println("Directly calling run on a thread instead of start, makes the thread run in the \nsame stack in which run is called, instead of a new one. Hence it halts execution\n in this stack, until it finishes running.");
        System.out.println();

        System.out.println("Calling start() on Maria");
        maria.start();
        System.out.println("Priority of Maria: " + maria.getPriority());
        System.out.println("Calling suspend() on Maria");
        maria.suspend();
        System.out.println();

        System.out.println("Calling start() on Serena");
        System.out.println("Priority of Serena: " + serena.getPriority());
        serena.start();
        System.out.println();

        try {
            System.out.println("Calling join() on Serena");
            serena.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Calling resume on Maria");
        maria.resume();
    }
}
