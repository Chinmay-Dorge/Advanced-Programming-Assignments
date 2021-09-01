import java.util.Arrays;

public class SortArray {
    public static void sorting(int[] arr) throws Exception {
        if (arr.length != 10)
            throw new IllegalArgumentException(
                    "Expected length of array is 10\nLenght of array recieved = " + arr.length);
        Arrays.sort(arr);
        printArray(arr);
    }

    static public void printArray(int[] arr) {
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        try {
            SortArray.sorting(new int[] { 99, 5, 34, 1313 });
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("--------------------------");
        try {
            SortArray.sorting(new int[] { 5, 1, 88, 77, 65, 144, 54, 2, 99, 33 });
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("--------------------------");
    }
}