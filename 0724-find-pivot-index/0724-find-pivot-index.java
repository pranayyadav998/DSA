class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int leftSum = 0;
            if(i>0) leftSum = nums[i-1];
            int rightSum = nums[nums.length-1]-nums[i];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}