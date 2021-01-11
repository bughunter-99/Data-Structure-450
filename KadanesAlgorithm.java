
public class KadanesAlgorithm {
    public static void main(String args[]) {
        int array[] = { -1, -2, -3, -4, -5 };
        System.out.println(maxSubarraySum(array, array.length - 1));
    }

    static int maxSubarraySum(int[] array, int size) {
        int globalSum = array[0];
        int currentSum = 0;
        for (int i = 0; i < size; i++) {
            currentSum = array[i];
            if (globalSum < currentSum) {
                globalSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return globalSum;
    }
}
