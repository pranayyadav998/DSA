class Solution {
    public int maxProfit(int[] prices) {
        int MinSoFar = prices[0];
        int ans = 0;

        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - MinSoFar;
            if(profit > ans){
                ans = profit;
            }
            MinSoFar = Math.min(MinSoFar, prices[i]);
        }
        return ans;
    }
}