class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum = 0;
        int m = discounts.length;
        int n = prices.length;
        int i = n-1;
        int j = m-1;
        while(i>=0 && j>=0){
            sum += prices[i]*((100-discounts[j])/100.0);
            i--;
            j--;
        }
        int idx = n-m-1;
        while(idx>=0){
            sum += prices[idx];
            idx--;
        }
        return sum;
    }
}