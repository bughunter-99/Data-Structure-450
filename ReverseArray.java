public class ReverseArray {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6 };

        reverseArray(array, 0, array.length - 1);
        printArray(array, array.length);

    }

    static void reverseArray(int array[], int start, int end) {
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

    }

    static void printArray(int array[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
