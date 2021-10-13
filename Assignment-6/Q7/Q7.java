import java.io.IOException;

public class Q7 {
    public void finalize() {
        System.out.println("garbage collection done!");
    }
    public static void main(String[] args) throws IOException {
        Q7 obj = new Q7();
        obj = null;
        System.gc();
        Runtime.getRuntime().exec("notepad mythread.java");
    }
}