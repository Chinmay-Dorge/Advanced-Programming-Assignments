//Write a Java method to find all twin prime numbers less than 100 such as (3, 5), (5, 7), (11, 13),………
public class Q1{
    static void printTwinPrime(int n)
    {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n - 2; i++) {
            if (prime[i] == true &&
                    prime[i + 2] == true)
                System.out.print(" (" + i + ", " +
                        (i + 2) + ")");
        }
    }
    public static void main(String args[]) {
        printTwinPrime(100);
    }
}