public class Q1{
    public static void main (String[] args) throws InterruptedException {
        MyThread sachin = new MyThread();
        MyThread virat = new MyThread();
        var sehwag = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getState()+" has started");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("\nState of Sachin before start() = "+ sachin.getState());
        System.out.println("State of VIrat before start() = "+ virat.getState());
        System.out.println("State of Sehwag before start() = "+ sehwag.getState()+"\n");

        System.out.print("Using start() on Sachin: ");
        sachin.start();
        sachin.join();

        virat.sleep(3000);

        System.out.println("State of Sachin = "+ sachin.getState()+"\nState of Sehwag = "+ sehwag.getState());
        System.out.print("Using start() on Virat: ");
        virat.start();
        virat.join();

        System.out.println("State of Sachin = "+ sachin.getState()+"\nStatus of Virat = "+ virat.getState());

        System.out.print("Using start() on Sehwag: ");
        sehwag.start();
        System.out.print("Using sleep() on Sehwag: ");
        Thread.sleep(10);
        System.out.println("Sehwag thread state*(blocked)* = "+ sehwag.getState());
        sehwag.join();

        System.out.println("\nState of sachin thread = "+sachin.getName()+sachin.getState());
        System.out.println("State of virat thread = "+virat.getName()+virat.getState());
        System.out.println("State of sehwag thread = "+sehwag.getState());
    }
}
