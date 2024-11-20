package SortAlgorithm.api;

import SortAlgorithm.InterFace.IdealArrayIsNull;
import SortAlgorithm.InterFace.SortInterface;
import SortAlgorithm.SortMetheds.BubbleSort;
import SortAlgorithm.SortMetheds.InsertSort;
import SortAlgorithm.SortMetheds.SelectedSort;
import SortAlgorithm.Utils.SortType;

import static SortAlgorithm.Utils.utils.toIdealArrayElementIsNull;
import static SortAlgorithm.Utils.utils.toIdealArrayIsNull;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

public class Sort {
    SortType sortType = SortType.Bubble;
    SortInterface sort;

    public Sort() {
        sort = new BubbleSort();
    }

    public Sort(SortInterface sort) {
        this.sort = sort;
    }

    /**
     * @param sortType the sort methods
     *                 选择在SortType中的一个枚举类型来指定这个对象使用的排序方法
     *                 当然,你也可以自己写一个排序算法,只要这个排序算法实现InterFace包中的SortInterface接口即可
     * @author A-rookie-of-C-Language
     */
    public Sort(SortType sortType) {
        this.sortType = sortType;
        switch (sortType) {
            case Heap, Quick, Counting, Bucket, Merge, Radix -> {
                break;
            }
            case Insertion -> sort = new InsertSort();
            case Bubble -> sort = new BubbleSort();
            case Selection -> sort = new SelectedSort();
        }
    }

    public <T extends Comparable<T>> void sort(T[] array) {
        sort(array, 0, array.length);
    }

    public <T extends Comparable<T>> void sort(T[] array, int start, int end) {
        sort(array, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public <T extends Comparable<T>> void sort(T[] array, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, start, end, ifArrayIsNull, ifArrayIsNull);
    }

    public <T extends Comparable<T>> void sort(T[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort.sorted(arr, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    public <T> void sort(T[] array, Comparator<T> comparator) {
        sort(array, comparator, 0, array.length);
    }

    public <T> void sort(T[] array, Comparator<T> comparator, int start, int end) {
        sort(array, comparator, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public <T> void sort(T[] array, Comparator<T> comparator, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, comparator, start, end, ifArrayIsNull, ifArrayIsNull);

    }

    public <T> void sort(T[] array, Comparator<T> comparator, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<T[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sort.sorted(arr, comparator, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    public void sort(byte[] array) {
        sort(array, 0, array.length);
    }

    public void sort(short[] array) {
        sort(array, 0, array.length);
    }

    public void sort(int[] array) {
        sort(array, 0, array.length);
    }

    public void sort(long[] array) {
        sort(array, 0, array.length);
    }

    public void sort(float[] array) {
        sort(array, 0, array.length);
    }

    public void sort(double[] array) {
        sort(array, 0, array.length);
    }

    public void sort(char[] array) {
        sort(array, 0, array.length);
    }

    public void sort(byte[] array, IdealArrayIsNull ifArrayIsNull) {
        sort(array, 0, array.length, ifArrayIsNull);
    }

    public void sort(short[] array, IdealArrayIsNull ifArrayIsNull) {
        sort(array, 0, array.length, ifArrayIsNull);
    }

    public void sort(int[] array, IdealArrayIsNull ifArrayIsNull) {
        sort(array, 0, array.length, ifArrayIsNull);
    }

    public void sort(long[] array, IdealArrayIsNull ifArrayIsNull) {
        sort(array, 0, array.length, ifArrayIsNull);
    }

    public void sort(float[] array, IdealArrayIsNull ifArrayIsNull) {
        sort(array, 0, array.length, ifArrayIsNull);
    }

    public void sort(double[] array, IdealArrayIsNull ifArrayIsNull) {
        sort(array, 0, array.length, ifArrayIsNull);
    }

    public void sort(char[] array, IdealArrayIsNull ifArrayIsNull) {
        sort(array, 0, array.length, ifArrayIsNull);
    }

    public void sort(byte[] array, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        sort(array, 0, array.length, ifArrayIsNull, ifArrayElementIsNull);
    }

    public void sort(short[] array, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        sort(array, 0, array.length, ifArrayIsNull, ifArrayElementIsNull);
    }

    public void sort(int[] array, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        sort(array, 0, array.length, ifArrayIsNull, ifArrayElementIsNull);
    }

    public void sort(long[] array, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        sort(array, 0, array.length, ifArrayIsNull, ifArrayElementIsNull);
    }

    public void sort(float[] array, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        sort(array, 0, array.length, ifArrayIsNull, ifArrayElementIsNull);
    }

    public void sort(double[] array, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        sort(array, 0, array.length, ifArrayIsNull, ifArrayElementIsNull);
    }

    public void sort(char[] array, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        sort(array, 0, array.length, ifArrayIsNull, ifArrayElementIsNull);
    }


    public void sort(byte[] array, int start, int end) {
        sort(array, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public void sort(byte[] array, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, start, end, ifArrayIsNull, ifArrayIsNull);
    }

    public void sort(short[] array, int start, int end) {
        sort(array, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public void sort(short[] array, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, start, end, ifArrayIsNull, ifArrayIsNull);
    }

    public void sort(int[] array, int start, int end) {
        sort(array, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public void sort(int[] array, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, start, end, ifArrayIsNull, ifArrayIsNull);
    }

    public void sort(long[] array, int start, int end) {
        sort(array, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public void sort(long[] array, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, start, end, ifArrayIsNull, ifArrayIsNull);
    }

    public void sort(float[] array, int start, int end) {
        sort(array, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public void sort(float[] array, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, start, end, ifArrayIsNull, ifArrayIsNull);
    }

    public void sort(double[] array, int start, int end) {
        sort(array, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public void sort(double[] array, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, start, end, ifArrayIsNull, ifArrayIsNull);
    }

    public void sort(char[] array, int start, int end) {
        sort(array, start, end, toIdealArrayIsNull, toIdealArrayElementIsNull);
    }

    public void sort(char[] array, int start, int end, IdealArrayIsNull ifArrayIsNull) {
        sort(array, start, end, ifArrayIsNull, ifArrayIsNull);
    }

    public void sort(byte[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<byte[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sortByte(arr, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    public void sort(short[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<short[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sortShort(arr, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    public void sort(int[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<int[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sortInt(arr, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    public void sort(long[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<long[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sortLong(arr, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    public void sort(float[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<float[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sortFloat(arr, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    public void sort(double[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<double[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sortDouble(arr, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }

    public void sort(char[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull) {
        try {
            Optional<char[]> arrayIsNull = Optional.ofNullable(array);
            arrayIsNull.ifPresentOrElse(arr -> sortChar(arr, start, end), ifArrayIsNull::toIdealArrayIsNull);
        } catch (NullPointerException e) {
            ifArrayElementIsNull.toIdealArrayIsNull();
        }
    }


    private void sortByte(byte[] array, int start, int end) {
        Byte[] temp = new Byte[end - start + 1];
        IntStream.range(start, end).forEach(i -> temp[i] = array[i]);
        sort(temp, start, end);
        IntStream.range(start, end).forEach(i -> array[i] = temp[i]);
    }

    private void sortShort(short[] array, int start, int end) {
        Short[] temp = new Short[end - start + 1];
        IntStream.range(start, end).forEach(i -> temp[i] = array[i]);
        sort(temp, start, end);
        IntStream.range(start, end).forEach(i -> array[i] = temp[i]);
    }

    private void sortInt(int[] array, int start, int end) {
        Integer[] temp = new Integer[end - start + 1];
        IntStream.range(start, end).forEach(i -> temp[i] = array[i]);
        sort(temp, start, end);
        IntStream.range(start, end).forEach(i -> array[i] = temp[i]);
    }

    private void sortLong(long[] array, int start, int end) {
        Long[] temp = new Long[end - start + 1];
        IntStream.range(start, end).forEach(i -> temp[i] = array[i]);
        sort(temp, start, end);
        IntStream.range(start, end).forEach(i -> array[i] = temp[i]);
    }

    private void sortFloat(float[] array, int start, int end) {
        Float[] temp = new Float[end - start + 1];
        IntStream.range(start, end).forEach(i -> temp[i] = array[i]);
        sort(temp, start, end);
        IntStream.range(start, end).forEach(i -> array[i] = temp[i]);
    }

    private void sortDouble(double[] array, int start, int end) {
        Double[] temp = new Double[end - start + 1];
        IntStream.range(start, end).forEach(i -> temp[i] = array[i]);
        sort(temp, start, end);
        IntStream.range(start, end).forEach(i -> array[i] = temp[i]);
    }

    private void sortChar(char[] array, int start, int end) {
        Character[] temp = new Character[end - start + 1];
        IntStream.range(start, end).forEach(i -> temp[i] = array[i]);
        sort(temp, start, end);
        IntStream.range(start, end).forEach(i -> array[i] = temp[i]);
    }
}