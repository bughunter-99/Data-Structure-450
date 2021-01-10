import java.util.Scanner;

public class FindKthMinMax {

    static void merge(int array[], int low, int mid, int high) {
        int sizeLeft = mid - low + 1;
        int sizeRight = high - mid;

        int left[] = new int[sizeLeft];
        int right[] = new int[sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            left[i] = array[low + i];
        }
        for (int j = 0; j < sizeRight; j++) {
            right[j] = array[mid + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = low;

        while (i < sizeLeft && j < sizeRight) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < sizeLeft) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < sizeRight) {
            array[k] = right[j];
            j++;
            k++;
        }

    }

    static void sort(int array[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(array, low, mid);
            sort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int[] array = { 12, 11, 13, 5, 6, 7 };
        sort(array, 0, array.length - 1);

        System.out.println("kth larget number is :" + array[array.length - k]);
        System.out.println("kth smallest number is :" + array[k]);
        scan.close();

    }
}
