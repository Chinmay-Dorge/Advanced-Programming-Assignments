public class MyThread extends Thread{
@Override
public void run(){
    System.out.println(Thread.currentThread().getState()+" has started");
    for(int i=0; i<3;i++ )
    {
        System.out.println( "Thread Running "+ i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    System.out.println("Thread terminated...\n");
    }
}
