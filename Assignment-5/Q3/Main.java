import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main
{
    public void uncheckedExceptions()
    {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size<0)
            throw new IllegalArgumentException("Size cannot be negative");
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=i;
        }
        System.out.print("Enter element you want to access: ");
        int pos = sc.nextInt();
        if(pos>size)
            throw new ArrayIndexOutOfBoundsException("Enter value between 0 and size-1");
        System.out.println("Element at pos "+pos+" = "+arr[pos-1]);


        System.out.print("Enter numerator: ");
        int num = sc.nextInt();
        System.out.print("Enter denominator: ");
        int den = sc.nextInt();
        if(den==0)
            throw new ArithmeticException("Denominator cannot be zero");
        System.out.println("Ans = "+num/den);
    }

    public void checkedException(int n) throws IOException,SQLException,ClassNotFoundException
    {
        if(n==1)
            throw new IOException("IO exception");
        if(n==2)
            throw new SQLException("Sql exception");
        if(n==3)
            throw new ClassNotFoundException("Class not found exception");
    }

    public static void main(String[] args){
        Main obj = new Main();
        try {
            obj.uncheckedExceptions();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException g) {
            System.out.println(g);
        } catch (ArithmeticException f) {
            System.out.println(f);
        }

        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try
        {
            obj.checkedException(num);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(SQLException f)
        {
            f.printStackTrace();
        }
        catch(ClassNotFoundException c)
        {
            c.printStackTrace();
        }
    }
}