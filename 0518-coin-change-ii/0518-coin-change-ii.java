class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length];

        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(amount, coins, 0, dp);
    }

    public int solve(int amount, int[] coins, int index, int[][] dp) {
        if (amount == 0) {
            return 1;
        }

        if (amount < 0 || index >= coins.length) {
            return 0;
        }

        if (dp[amount][index] != -1) {
            return dp[amount][index];
        }

        int include = solve(amount - coins[index], coins, index, dp);

        int exclude = solve(amount, coins, index + 1, dp);

        dp[amount][index] = include + exclude;

        return dp[amount][index];
    }
}