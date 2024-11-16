package sort;

import java.util.*;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        useBubbleSort(array, 0, array.length);
    }

    public static <T extends Comparable<T>> void sort(T[] array, int start, int end) {
        useBubbleSort(array, start, end);
    }

    public static <T> void sort(T[] array, Comparator<T> comparator) {
        useBubbleSort(array, comparator, 0, array.length - 1);
    }

    public static <T> void sort(T[] array, Comparator<T> comparator, int start, int end) {
        useBubbleSort(array, comparator, start, end);
    }

    public static void sort(int[] array){
        try {
            Optional<int[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> sort(arr, 0, arr.length));
        }catch (NullPointerException a){
            System.out.println("array is null");
        }
    }

    public static void sort(short[] array) {
        try {
            Optional<short[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> sort(arr, 0, arr.length));
        }catch (NullPointerException a){
            System.out.println("array is null");
        }
    }

    public static void sort(long[] array) {
        try {
            Optional<long[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> sort(arr, 0, arr.length));
        }catch (NullPointerException a){
            System.out.println("array is null");
        }
    }

    public static void sort(float[] array) {
        try {
            Optional<float[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> sort(arr, 0, arr.length));
        }catch (NullPointerException a){
            System.out.println("array is null");
        }
    }

    public static void sort(double[] array) {
        try {
            Optional<double[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> sort(arr, 0, arr.length));
        }catch (NullPointerException a){
            System.out.println("array is null");
        }
    }

    public static void sort(char[] array) {
        try {
            Optional<char[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> sort(arr, 0, arr.length));
        }catch (NullPointerException a){
            System.out.println("array is null");
        }
    }


    public static void sort(int[] array, int start, int end) {
        try {
            Optional<int[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            swap(array, j, j + 1);
                        }
                    }
                }
            });
        } catch (NullPointerException npe) {
            System.out.println("array is null");
        }

    }

    public static void sort(short[] array, int start, int end) {
        try {
            Optional<short[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            swap(array, j, j + 1);
                        }
                    }
                }
            });
        } catch (NullPointerException npe) {
            System.out.println("array is null");
        }
    }


    public static void sort(long[] array, int start, int end) {
        try {
            Optional<long[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            swap(array, j, j + 1);
                        }
                    }
                }
            });
        } catch (NullPointerException npe) {
            System.out.println("array is null");
        }
    }


    public static void sort(float[] array, int start, int end) {
        try {
            Optional<float[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            swap(array, j, j + 1);
                        }
                    }
                }
            });
        } catch (NullPointerException npe) {
            System.out.println("array is null");
        }
    }


    public static void sort(double[] array, int start, int end) {
        try {
            Optional<double[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            swap(array, j, j + 1);
                        }
                    }
                }
            });
        } catch (NullPointerException npe) {
            System.out.println("array is null");
        }
    }

    public static void sort(char[] array, int start, int end) {
        try {
            Optional<char[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            swap(array, j, j + 1);
                        }
                    }
                }
            });
        } catch (NullPointerException npe) {
            System.out.println("array is null");
        }
    }


    private static <T extends Comparable<T>> void useComparableSort(T[] array, int start, int end) {
        try {
            Optional<T[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arrayIsNull1 -> comparableSort(array, start, end));
        }catch (NullPointerException npe) {
            System.out.println("array is null");
        }

    }

    private static <T> void useComparatorSort(T[] array, Comparator<T> comparator, int start, int end) {
        try {
            Optional<T[]> arrayIsNull = Optional.of(array);
            arrayIsNull.ifPresent(arrayIsNull1 -> ComparatorSort(array, comparator, start, end));
        }catch (NullPointerException nullPointerException){
            System.out.println("array is null");
        }

    }

    private static <T extends Comparable<T>> void comparableSort(T[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = start; j < end - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static <T> void ComparatorSort(T[] array, Comparator<T> comparator, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = start; j < end - i - 1; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }


    private static <T> void useBubbleSort(T[] array, Comparator<T> comparator, int start, int end) {
        useComparatorSort(array, comparator, start, end);
    }

    private static <T extends Comparable<T>> void useBubbleSort(T[] array, int start, int end) {
        useComparableSort(array, start, end);
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(short[] array, int i, int j) {
        short temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(long[] array, int i, int j) {
        long temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(float[] array, int i, int j) {
        float temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
