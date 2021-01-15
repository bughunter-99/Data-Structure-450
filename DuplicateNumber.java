public class DuplicateNumber {

    static int findDuplicates(int nums[]) {

        if (nums == null || nums.length <= 1) {
            return -1;
        }
        int turtle = 0;
        int hare = 0;
        int finder = 0;

        while (true) {
            turtle = nums[turtle];
            hare = nums[nums[hare]];
            System.out.println(hare);

            if (turtle == hare) {
                break;
            }
        }
        while (true) {
            turtle = nums[turtle];
            finder = nums[finder];

            if (turtle == finder) {
                return turtle;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 1 };

        System.out.println(findDuplicates(nums));
    }

}
