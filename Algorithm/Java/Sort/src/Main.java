import SortAlgorithm.api.Sort;
import SortAlgorithm.Utils.SortType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 3, 2, 5, 4, 6, 7, 8, 9, 10};
        Sort sort =new Sort(SortType.Insertion);
        sort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}