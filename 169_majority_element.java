import java.util.Arrays;

class majorityElement {
    public int MajorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len / 2];
//        find the middle number in array. Because the majority number always occur more than n/2 times, so it's position will be present at index n/2.
    }

    public static void main(String[] args) {
        majorityElement maj = new majorityElement();
        System.out.println(maj.MajorityElement(new int[]{6, 5, 5}));
    }
}