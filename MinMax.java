public class MinMax {

    static class Pair {
        int min;
        int max;
    }
    // divide array in two parts method

    static Pair getMinMax(int array[], int low, int high) {
        Pair minmax = new Pair();
        Pair minmaxLeft = new Pair();
        Pair minmaxRight = new Pair();

        if (low == high) {
            minmax.max = array[low];
            minmax.min = array[low];
            return minmax;
        }
        if (high == low + 1) {
            if (array[low] > array[high]) {
                minmax.max = array[low];
                minmax.min = array[high];
            } else if (array[low] < array[high]) {
                minmax.max = array[high];
                minmax.min = array[low];
            }
            return minmax;
        }

        int mid = (low + high) / 2;
        minmaxLeft = getMinMax(array, low, mid);
        minmaxRight = getMinMax(array, mid + 1, high);

        if (minmaxLeft.min < minmaxRight.min) {
            minmax.min = minmaxLeft.min;
        } else {
            minmax.min = minmaxRight.min;
        }

        if (minmaxLeft.max > minmaxRight.max) {
            minmax.max = minmaxLeft.max;

        } else {
            minmax.max = minmaxRight.max;
        }

        return minmax;
    }

    // Linear search method

    // static Pair getMinMax(int array[],int size ) {
    //
    // Pair minmax = new Pair();
    // if there is only one element in the array.
    // if(size == 1) {
    // minmax.max = array[0];
    // minmax.min = array[0];
    //
    // return minmax;
    // }
    // for more than one elements in the array.
    // if(array[0]>array[1]) {
    // minmax.max = array[0];
    // minmax.min = array[1];
    // }else {
    // minmax.max = array[1];
    // minmax.min = array[0];
    // }
    //
    // for(int i = 2;i<size;i++) {
    // if(array[i]>minmax.max) {
    // minmax.max = array[i];
    // }else if(array[i]<minmax.min) {
    // minmax.min = array[i];
    // }
    // }
    // return minmax;
    // }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] array = { 1000, 11, 445, 1, 330, 3000, 50000, -1, -2, 0, 11, 2455634, 2345564, 65312 };
        Pair minmaxPair = getMinMax(array, 0, array.length - 1);
        System.out.println("max numbar is :" + minmaxPair.max);
        System.out.println("min number is :" + minmaxPair.min);
    }

}