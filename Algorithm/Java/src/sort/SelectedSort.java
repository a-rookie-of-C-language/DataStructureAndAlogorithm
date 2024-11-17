package sort;

import java.util.Comparator;
import java.util.Optional;

public class SelectedSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort(arr, 0, arr.length),SelectedSort::toIdealArrayIsNull);
        }catch (NullPointerException e) {
            toIdealArrayElementIsNull();
        }
    }

    public static <T> void sort(T[] array, Comparator<T> comparator) {

    }

    public static <T extends Comparable<T>> void sort(T[] array, int start, int end) {

    }

    private static void toIdealArrayIsNull(Runnable runnable){
        runnable.run();
    }

    private static void toIdealArrayIsNull(){

    }

    private static void toIdealArrayElementIsNull(Runnable runnable){
        runnable.run();
    }

    private static void toIdealArrayElementIsNull(){

    }
}
