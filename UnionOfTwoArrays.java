public class UnionOfTwoArrays {
    static int union(int array1[], int array2[]) {
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                count++;
                i++;
            } else if (array1[i] > array2[j]) {
                count++;
                j++;
            } else {
                i++;
            }
        }
        while (i < array1.length) {
            count++;
            i++;
        }
        while (j < array2.length) {
            count++;
            j++;
        }
        return count;
    }

    public static void main(String args[]) {
        int array1[] = { 10, 12, 16 };
        int array2[] = { 10, 16, 39, 59, 60, 11 };

        System.out.println(union(array1, array2));
    }
}
