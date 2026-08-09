class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        // suffix[i] = total stones from i to n-1
        int[] suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        int[][] dp = new int[n][n + 1];

        // dp[i][M] = maximum stones current player can get
        // from index i with M
        for (int i = n - 1; i >= 0; i--) {
            for (int M = 1; M <= n; M++) {

                // If we can take all remaining piles
                if (i + 2 * M >= n) {
                    dp[i][M] = suffix[i];
                    continue;
                }

                int best = 0;

                // Try taking X piles
                for (int X = 1; X <= 2 * M && i + X <= n; X++) {

                    int newM = Math.max(M, X);

                    // Stones current player gets
                    int taken = suffix[i] - suffix[i + X];

                    // Stones remaining after taking X piles
                    int remaining = suffix[i + X];

                    // Opponent can optimally take dp[i+X][newM]
                    int current = taken
                            + (remaining - dp[i + X][newM]);

                    best = Math.max(best, current);
                }

                dp[i][M] = best;
            }
        }

        return dp[0][1];
    }
}