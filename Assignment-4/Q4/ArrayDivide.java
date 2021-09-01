import java.util.Arrays;

public class ArrayDivide {
    public static void divArray(int[] arr, int n) throws Exception {
        if (arr.length != 15)
            throw new IllegalArgumentException(
                    "Expected length of array is 15\nLenght of array recieved = " + arr.length);
        for (int i=0;i<15;i++)
            arr[i] /= n;
        printArray(arr);
    }

    static public void printArray(int[] arr) {
        System.out.println("Divided array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        try {
            ArrayDivide.divArray(new int[] { 1,2,3,4 }, 3);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("--------------------------");
        System.out.println();
        try {
            ArrayDivide.divArray(new int[] { 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98, 105 }, 7);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("--------------------------");
    }
}