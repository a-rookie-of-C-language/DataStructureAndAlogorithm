import sort.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //arr[2] = null;
        Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        a[2] = null;
        //BubbleSort.sort(arr);
        BubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(arr));
    }
}