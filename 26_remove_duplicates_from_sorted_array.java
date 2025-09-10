import java.util.Arrays;

class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = 4864;
            }
        }
        Arrays.sort(nums);
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 4864) {
                break;
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        removeDuplicates removeDuplicates = new removeDuplicates();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
}