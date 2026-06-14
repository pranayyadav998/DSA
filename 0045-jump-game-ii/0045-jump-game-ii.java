class Solution {
    public int jump(int[] nums) {
        int totalJumps = 0;
        int coverage = 0;
        int LastJumpInd = 0;

        int Destination = nums.length-1;

        if(nums.length == 1) return 0;

        for(int i=0;i<nums.length;i++){
            coverage = Math.max(coverage, i + nums[i]);

            if(i == LastJumpInd){
                LastJumpInd = coverage;
                totalJumps++; 
               
                if(coverage >= Destination){
                return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}