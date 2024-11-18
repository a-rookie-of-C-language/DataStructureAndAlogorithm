package SortAlgorithm.SortMetheds;

import SortAlgorithm.InterFace.SortInterface;

import java.util.Comparator;

public class InsertSort implements SortInterface {
    @Override
    public <T extends Comparable<T>> void sorted(T[] array, int start, int end) {
        int j;
        for (int i = start+1; i < end; i++) {
            if(array[i].compareTo(array[i-1])<0){
                T temp = array[i];
                for (j = i-1; j >= start&&temp.compareTo(array[j])<0; j--) {
                    array[j+1] = array[j];
                }
                array[j+1] = temp;
            }
        }
    }

    @Override
    public <T> void sorted(T[] array, Comparator<T> comparator, int start, int end) {
        int j;
        for (int i = start+1; i < end; i++) {
            if(comparator.compare(array[i],array[i-1])<0){
                T temp = array[i];
                for (j = i-1;j>=0&&comparator.compare(array[i],array[j])<0; j--) {
                    array[j+1] = array[j];
                }
                array[j+1] = temp;
            }
        }
    }
}
