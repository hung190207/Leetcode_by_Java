import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(input, target);
        System.out.println(Arrays.toString(result));
    }
}