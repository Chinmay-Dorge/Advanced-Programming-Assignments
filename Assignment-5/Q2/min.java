package Q2;
public class min {
    public int getMin(int[] arr) throws Exception{
        if (arr.length == 0)
            throw new Exception("Array size 0 - cannot compute minimum ");
        int min = arr[0];
        for (int i : arr)
            if (min > i)
                min = i;
        return min;
    }
}