package sort;

public class utils {

    protected static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    protected static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    protected static void swap(short[] array, int i, int j) {
        short temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    protected static void swap(long[] array, int i, int j) {
        long temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    protected static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    protected static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    protected static void swap(float[] array, int i, int j) {
        float temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    protected static void ifArrayIsNull() {
        System.out.println("Array is null");
    }

    protected static void ifArrayElementIsNull() {
        System.out.println("no element");
    }
}
