class Solution {

    int[][] dp;

    public int solve(int sum, int target, int[][] mat, int row) {

        if (row == mat.length) {
            return Math.abs(target - sum);
        }

        if (dp[row][sum] != -1) {
            return dp[row][sum];
        }

        int mini = Integer.MAX_VALUE;

        for (int num : mat[row]) {
            int ans = solve(sum + num, target, mat, row + 1);
            mini = Math.min(mini, ans);
        }

        dp[row][sum] = mini;

        return mini;
    }

    public int minimizeTheDifference(int[][] mat, int target) {

        int maxSum = mat.length * 70;

        dp = new int[mat.length][maxSum + 1];

        for (int i = 0; i < mat.length; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(0, target, mat, 0);
    }
}