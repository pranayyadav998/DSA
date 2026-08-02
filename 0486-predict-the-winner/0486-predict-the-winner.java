class Solution {
    int[][] dp;
    public boolean predictTheWinner(int[] nums) {
        dp = new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(nums, 0, nums.length-1) >=0;
    }
    private int solve(int[] nums, int i, int j){
        if(i==j) return nums[i];
        if(dp[i][j] != -1) return dp[i][j];
        int take = nums[i] - solve(nums, i + 1,j);
        int skip = nums[j] - solve(nums, i, j -1);
        return dp[i][j] = Math.max(take, skip);
    }
}