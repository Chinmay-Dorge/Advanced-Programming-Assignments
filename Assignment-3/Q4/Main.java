import java.util.Scanner;
public class Main {
    static long binaryToDecimal(String bin , int i){
        int n = bin.length();
        if (i == n-1)
            return bin.charAt(i) - '0';

        return ((bin.charAt(i) - '0') << (n-i-1)) +
                binaryToDecimal(bin, i+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String input = sc.nextLine();
        System.out.println("Decimal = " + binaryToDecimal(input,0));
    }
}