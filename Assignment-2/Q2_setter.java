import java.util.Scanner;
class setterOnlyClass{
    int val;
    public void setValue(int val){
        this.val = val;
        System.out.println("Value has been successfully set ");
    }
}
public class Q2_setter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for the setter class: ");
        int input = sc.nextInt();
        setterOnlyClass s = new setterOnlyClass();
        s.setValue(input);
    }
}