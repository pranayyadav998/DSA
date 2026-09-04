class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            int max = nums[0];
            int min = nums[i];

            for(int j=0;j<=i;j++){
                max = Math.max(nums[j],max);
            }

            for(int j=i;j<n;j++){
                min = Math.min(nums[j],min);
            }

            int ans = max-min;

            if(ans <= k) return i;
        }
        return -1;
    }
}