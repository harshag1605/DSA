class Solution {
    Integer dp[][];
    public int maxProfit(int[] prices) {
        dp = new Integer[prices.length][2];
        return fun(prices,0,0);
    }
    int fun(int prices[], int i, int buy){
        if(i >= prices.length)return 0;
        if(dp[i][buy] != null)return dp[i][buy];
        int profit;
        if(buy == 0){
            int a = fun(prices,i+1,1) - prices[i];
            int b = fun(prices,i+1,0);
            profit = Math.max(a,b);
        }
        else{
            int a = fun(prices,i+2,0) + prices[i];
            int b = fun(prices,i+1,1);
            profit = Math.max(a,b);
        }
        return dp[i][buy] = profit;
    }
}