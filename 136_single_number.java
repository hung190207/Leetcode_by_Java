class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
//        Using bitwise XOR
//        about how XOR works: https://www.baeldung.com/java-xor-operator

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
//        i.e:
//        for the first loop: index is 0 (xor) and 4 (nums[i])
//        convert into Binary there are: 0000 ^ (XOR) 0100 = 0100
//        to explain is all duplicate numbers cancel each other because XOR of a number itself is 0.
//        so the single number remains by 0 XOR x = x
//        For easier explanation: https://www.youtube.com/watch?v=nMC78grcvGw
//        cre: CodingNinja
        return xor;
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}