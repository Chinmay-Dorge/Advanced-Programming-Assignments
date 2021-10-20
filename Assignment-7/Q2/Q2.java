class printNum
{
    public static synchronized void func(int n,int m) {
        for(int i=n;i<=m;i++){
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println();
    }
}
class t1 extends Thread {
    @Override
    public void run() {
        printNum.func(1,10);
    }
}
class t3 extends Thread {
    @Override
    public void run() {
        printNum.func(21,30);
    }
}
class t2 extends Thread {
    @Override
    public void run() {
        printNum.func(11,20);
    }
}
public class Q2 {
    public static void main(String[] args) {
        t1 t1 = new t1();
        t2 t2 = new t2();
        t3 t3 = new t3();
        t1.start();
        t2.start();
        t3.start();
    }
}