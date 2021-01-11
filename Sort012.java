import java.util.Arrays;

public class Sort012 {
    static void threeWayPartition(int array[], int size) {
        int start = 0;
        int mid = 0;
        int pivot = 1;

        while (mid <= size) {
            if (array[mid] < pivot) {
                swap(array, start, mid);
                ++start;
                ++mid;
            } else if (array[mid] > pivot) {
                swap(array, mid, size);
                --size;
            } else {
                ++mid;
            }
        }
    }

    static void swap(int array[], int start, int end) {
        int temp;
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    public static void main(String args[]) {
        int array[] = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        threeWayPartition(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
