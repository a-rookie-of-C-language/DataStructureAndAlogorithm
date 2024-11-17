package sort;

import java.util.*;
import sort.utils;

import static sort.utils.*;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        useComparableSort(array, 0, array.length);
    }

    public static <T extends Comparable<T>> void sort(T[] array, IdealArrayIsNull idealArrayIsNull) {
        sort(array, idealArrayIsNull, idealArrayIsNull);
    }

    public static <T extends Comparable<T>> void sort(T[] array, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sort(array, 0, array.length, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static <T extends Comparable<T>> void sort(T[] array, int start, int end) {
        useComparableSort(array, start, end);
    }

    public static <T extends Comparable<T>> void sort(T[] array, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        useComparableSort(array, start, end, idealArrayIsNull);
    }

    public static <T extends Comparable<T>> void sort(T[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        useComparableSort(array, start, end, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static <T> void sort(T[] array, Comparator<T> comparator) {
        useComparatorSort(array, comparator, 0, array.length);
    }

    public static <T> void sort(T[] array, Comparator<T> comparator, IdealArrayIsNull idealArrayIsNull) {
        sort(array, comparator, idealArrayIsNull, idealArrayIsNull);
    }

    public static <T> void sort(T[] array, Comparator<T> comparator, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        useComparatorSort(array, comparator, 0, array.length, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static <T> void sort(T[] array, Comparator<T> comparator, int start, int end) {
        useComparatorSort(array, comparator, start, end);
    }

    public static <T> void sort(T[] array, Comparator<T> comparator, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        sort(array, comparator, start, end, idealArrayIsNull, idealArrayIsNull);
    }

    public static <T> void sort(T[] array, Comparator<T> comparator, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        useComparatorSort(array, comparator, start, end, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(short[] array) {
        try {
            Optional<short[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort(arr, 0, arr.length), utils::ifArrayElementIsNull);
        } catch (NullPointerException a) {
            ifArrayIsNull();
        }
    }

    public static void sort(int[] array) {
        try {
            Optional<int[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort(arr, 0, arr.length), utils::ifArrayElementIsNull);
        } catch (NullPointerException a) {
            ifArrayIsNull();
        }
    }

    public static void sort(long[] array) {
        try {
            Optional<long[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort(arr, 0, arr.length), utils::ifArrayElementIsNull);
        } catch (NullPointerException a) {
            ifArrayIsNull();
        }
    }


    public static void sort(float[] array) {
        try {
            Optional<float[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort(arr, 0, arr.length), utils::ifArrayElementIsNull);
        } catch (NullPointerException a) {
            ifArrayIsNull();
        }
    }

    public static void sort(double[] array) {
        try {
            Optional<double[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort(arr, 0, arr.length), utils::ifArrayElementIsNull);
        } catch (NullPointerException a) {
            ifArrayIsNull();
        }
    }


    public static void sort(char[] array) {
        try {
            Optional<char[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort(arr, 0, arr.length), utils::ifArrayElementIsNull);
        } catch (NullPointerException a) {
            ifArrayIsNull();
        }
    }

    public static void sort(short[] array, IdealArrayIsNull idealArrayIsNull) {
        sort(array, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(short[] array, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sort(array, 0, array.length, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(short[] array, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        sort(array, start, end, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(short[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sortAndIdealNullArrays(array, start, end, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(int[] array, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        sort(array, start, end, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(int[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sortAndIdealNullArrays(array, start, end, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(int[] array, IdealArrayIsNull idealArrayIsNull) {
        sort(array, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(int[] array, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sort(array, 0, array.length, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(long[] array, IdealArrayIsNull idealArrayIsNull) {
        sort(array, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(long[] array, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sort(array, 0, array.length, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(long[] array, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        sort(array, start, end, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(long[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sortAndIdealNullArrays(array, start, end, idealArrayIsNull, idealArrayElementIsNull);
    }


    public static void sort(float[] array, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        sort(array, start, end, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(float[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sortAndIdealNullArrays(array, start, end, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(float[] array, IdealArrayIsNull idealArrayIsNull) {
        sort(array, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(float[] array, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sort(array, 0, array.length, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(double[] array, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        sort(array, start, end, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(double[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sortAndIdealNullArrays(array, start, end, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(double[] array, IdealArrayIsNull idealArrayIsNull) {
        sort(array, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(double[] array, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sort(array, 0, array.length, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(char[] array, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        sortAndIdealNullArrays(array, start, end, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(char[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sortAndIdealNullArrays(array, start, end, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(char[] array, IdealArrayIsNull idealArrayIsNull) {
        sort(array, idealArrayIsNull, idealArrayIsNull);
    }

    public static void sort(char[] array, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        sort(array, 0, array.length, idealArrayIsNull, idealArrayElementIsNull);
    }

    public static void sort(int[] array, int start, int end) {
        try {
            Optional<int[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, utils::ifArrayElementIsNull);
        } catch (NullPointerException npe) {
            ifArrayIsNull();
        }
    }

    public static void sort(short[] array, int start, int end) {
        try {
            Optional<short[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, utils::ifArrayElementIsNull);
        } catch (NullPointerException npe) {
            ifArrayIsNull();
        }
    }

    public static void sort(long[] array, int start, int end) {
        try {
            Optional<long[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, utils::ifArrayElementIsNull);
        } catch (NullPointerException npe) {
            ifArrayIsNull();
        }
    }

    public static void sort(float[] array, int start, int end) {
        try {
            Optional<float[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, utils::ifArrayElementIsNull);
        } catch (NullPointerException npe) {
            ifArrayIsNull();
        }
    }

    public static void sort(double[] array, int start, int end) {
        try {
            Optional<double[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, utils::ifArrayElementIsNull);
        } catch (NullPointerException npe) {
            ifArrayIsNull();
        }
    }

    public static void sort(char[] array, int start, int end) {
        try {
            Optional<char[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, utils::ifArrayElementIsNull);
        } catch (NullPointerException npe) {
            ifArrayIsNull();
        }
    }


    private static void sortAndIdealNullArrays(char[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        try {
            Optional<char[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException npe) {
            idealArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    private static void sortAndIdealNullArrays(long[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        try {
            Optional<long[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException npe) {
            idealArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    private static void sortAndIdealNullArrays(double[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        try {
            Optional<double[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException npe) {
            idealArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    private static void sortAndIdealNullArrays(float[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        try {
            Optional<float[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException npe) {
            idealArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    private static void sortAndIdealNullArrays(short[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        try {
            Optional<short[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException npe) {
            idealArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    private static void sortAndIdealNullArrays(int[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementIsNull) {
        try {
            Optional<int[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> {
                for (int i = start; i < end; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }, idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException npe) {
            idealArrayElementIsNull.toIdealArrayIsNull();
        }
    }


    private static <T extends Comparable<T>> void useComparableSort(T[] array, int start, int end) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arrayIsNull1 -> comparableSort(arrayIsNull1, start, end), utils::ifArrayIsNull);
        } catch (NullPointerException npe) {
            ifArrayElementIsNull();
        }

    }

    private static <T extends Comparable<T>> void useComparableSort(T[] array, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arrayIsNull1 -> comparableSort(arrayIsNull1, start, end), idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException npe) {
            idealArrayIsNull.toIdealArrayIsNull();
        }
    }

    private static <T extends Comparable<T>> void useComparableSort(T[] array, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementsIsNull) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arrayIsNull1 -> comparableSort(arrayIsNull1, start, end), idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException npe) {
            idealArrayElementsIsNull.toIdealArrayIsNull();
        }
    }

    private static <T> void useComparatorSort(T[] array, Comparator<T> comparator, int start, int end) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arrayIsNull1 -> ComparatorSort(arrayIsNull1, comparator, start, end), utils::ifArrayElementIsNull);
        } catch (NullPointerException nullPointerException) {
            ifArrayIsNull();
        }
    }

    private static <T> void useComparatorSort(T[] array, Comparator<T> comparator, int start, int end, IdealArrayIsNull idealArrayIsNull) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arrayIsNull1 -> ComparatorSort(arrayIsNull1, comparator, start, end), idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException nullPointerException) {
            idealArrayIsNull.toIdealArrayIsNull();
        }
    }

    private static <T> void useComparatorSort(T[] array, Comparator<T> comparator, int start, int end, IdealArrayIsNull idealArrayIsNull, IdealArrayIsNull idealArrayElementsIsNull) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arrayIsNull1 -> ComparatorSort(arrayIsNull1, comparator, start, end), idealArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException nullPointerException) {
            idealArrayElementsIsNull.toIdealArrayIsNull();
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

}
