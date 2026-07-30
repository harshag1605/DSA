class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum = prices[i] + prices[j];
                if(sum <= money){
                    max = Integer.max(max, money-sum);
                }
            }
        }
        if(max == Integer.MIN_VALUE){
            return money;
        }
        else return max;
    }
}