public class Q3{
    static Object Lock_1 = new Object(), Lock_2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                try{
                    System.out.println("t1 locking Lock_1.");
                    synchronized(Lock_1){
                        System.out.println("t1 has locked Lock_1");
                        Thread.sleep(1000);
                        System.out.println("t1 trying to lock Lock_2");
                        synchronized(Lock_2){
                            System.out.println("t1 has acquired both Lock_1 and Lock_2 (We will never reach here)");
                        }
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                try{
                    System.out.println("t2 locking Lock_2.");
                    synchronized(Lock_2){
                        System.out.println("t2 has locked Lock_2");
                        Thread.sleep(1000);
                        System.out.println("t2 trying to lock Lock_1");
                        synchronized(Lock_1){
                            System.out.println("t1 has acquired both Lock_1 and Lock_2");
                        }
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run(){
                try{
                    System.out.println("t3 trying to lock Lock_1");
                    Thread.sleep(1000);
                    synchronized(Lock_1){
                        System.out.println("t3 has locked Lock_1 (We will never reach here)");
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            public void run(){
                try{
                    System.out.println("t4 trying to lock Lock_2.");
                    Thread.sleep(1000);
                    synchronized(Lock_2){
                        System.out.println("t4 has locked Lock_2 (We will never reach here)");
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            Thread.sleep(2000);
            if(t1.isAlive()) {
                System.out.println("t1 is in deadlock.");
            }
            if(t2.isAlive()) {
                System.out.println("t2 is in deadlock.");
            }
            if(t3.isAlive()) {
                System.out.println("t3 is in deadlock.");
            }
            if(t4.isAlive()) {
                System.out.println("t4 is in deadlock.");
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}