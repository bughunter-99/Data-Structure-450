public class MinJump {
    static int minJumps(int array[]) {

        if (array.length <= 1) {
            return 0;
        }

        if (array[0] == 0) {
            return -1;
        }

        int maxReach = array[0];
        int step = array[0];
        int jump = 1;

        for (int i = 1; i < array.length; i++) {

            if (i == array.length - 1) {
                return jump;
            }

            maxReach = Math.max(maxReach, i + array[i]);
            step--;

            if (step == 0) {
                jump++;

                if (i >= maxReach) {
                    return -1;
                }
                step = maxReach - i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 4, 3, 2, 6, 7 };

        System.out.println(minJumps(array));
    }

}
