class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = Math.max(nums[i], sum + nums[i]);
            MaxSum = Math.max(MaxSum, sum);
        }
        return MaxSum;
    }
}