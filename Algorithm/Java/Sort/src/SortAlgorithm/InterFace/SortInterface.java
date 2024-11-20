package SortAlgorithm.InterFace;

import java.util.Comparator;

public interface SortInterface {
    <T extends Comparable<T>> void sorted(T[] array, int start, int end);
    <T> void sorted(T[] array, Comparator<T> comparator, int start, int end);
}
