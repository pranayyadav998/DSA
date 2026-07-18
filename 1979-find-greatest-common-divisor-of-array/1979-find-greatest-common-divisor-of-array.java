class Solution {
    private int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public int findGCD(int[] nums) {
        int s = nums[0];
        int m = nums[0];

        for(int n : nums){
            s = Math.min(s,n);
            m = Math.max(m,n);
        }
          return gcd(s, m);
    }
}