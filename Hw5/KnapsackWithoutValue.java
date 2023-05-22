package AISD.Hw.Hw5;

public class KnapsackWithoutValue {
    public static int knapsack(int W, int[] wt) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(wt[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] wt = {5, 3, 8, 1};
        int W = 10;
        int result = knapsack(W, wt);
        System.out.println(result); // Output: 50
    }
}
