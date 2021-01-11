import java.util.Arrays;

public class CyclicallyRotateAnArrayByOne {
    static void rotateByOne(int array[], int size) {
        int last = array[size];
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];

        }
        array[0] = last;
    }

    public static void main(String args[]) {
        int array[] = { 5, 4, 3, 2, 1 };
        rotateByOne(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}