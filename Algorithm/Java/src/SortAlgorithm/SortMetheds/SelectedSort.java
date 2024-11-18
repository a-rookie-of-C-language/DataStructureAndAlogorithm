package SortAlgorithm.SortMetheds;

import SortAlgorithm.InterFace.SortInterface;

import java.util.Comparator;

import static SortAlgorithm.Utils.utils.*;

public class SelectedSort implements SortInterface {

    @Override
    public <T extends Comparable<T>> void sorted(T[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            int index = i;
            for (int j = i + 1; j < end; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    index = j;
                }
            }
            if (index != i) {
                swap(array, index, i);
            }
        }
    }

    @Override
    public <T> void sorted(T[] array, Comparator<T> comparator, int start, int end) {
        for (int i = start; i < end; i++) {
            int index = i;
            for (int j = i + 1; j < end; j++) {
                if (comparator.compare(array[i], array[j]) > 0) {
                    index = j;
                }
            }
            if (index != i) {
                swap(array, index, i);
            }
        }
    }

}
