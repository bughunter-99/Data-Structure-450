import java.util.Arrays;

public class ArrangeNegativeArray {

    static void rearrange(int array[], int size) {
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                if (i != j) {
                    swap(array, i, j);
                }
                j++;
            }

        }
    }

    static void swap(int array[], int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String args[]) {
        int array[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        rearrange(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
