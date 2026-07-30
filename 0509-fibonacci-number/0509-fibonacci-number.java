class Solution {
    static int[] dp;
    private int solve(int n){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = solve(n-1)+solve(n-2);
    }
    public int fib(int n) {
        dp = new int[n+1];
        return solve(n);
    }
}