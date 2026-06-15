import java.util.Arrays;

class Solution {

    int[][] dp;

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        dp = new int[n][n + 1];

        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(nums, 0, -1);
    }

    public int solve(int[] nums, int idx, int prevIdx) {

        // Base Case
        if(idx == nums.length) {
            return 0;
        }

        // Memoization Check
        if(dp[idx][prevIdx + 1] != -1) {
            return dp[idx][prevIdx + 1];
        }

        // Choice 1: Not Take
        int notTake = solve(nums, idx + 1, prevIdx);

        // Choice 2: Take
        int take = 0;

        if(prevIdx == -1 || nums[idx] > nums[prevIdx]) {
            take = 1 + solve(nums, idx + 1, idx);
        }

        // Store and Return
        return dp[idx][prevIdx + 1] = Math.max(take, notTake);
    }
}