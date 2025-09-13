class climbingStairs {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
//        Using dynamic programming because time limit exceed by recursion.
        int[] dp = new int[n + 1];
//        Create an array to save every ways to reach to top.
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
//            Save distinct ways to climb to the top for each loop.
        }
        return dp[n];
    }

    public static void main(String[] args) {
        climbingStairs test = new climbingStairs();
        System.out.println(test.climbStairs(45));
    }
}