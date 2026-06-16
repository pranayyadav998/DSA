class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]= -1;
            }
        }
        return solve(m -1 , n - 1);
    }
    public int solve(int i, int j){
        if(dp[i][j] != -1) return dp[i][j];
        if(i == 0 || j == 0) return 1;

        return dp[i][j] =solve(i-1, j) + solve(i , j-1);
    }
}