class Solution {
    private int check(int[] nums, int sum){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == sum){
                return check(nums, sum+1);
            }
        }
        return sum;
    }
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]+1) sum += nums[i];
            else break;
        }
 
        return check(nums,sum);
    }
}