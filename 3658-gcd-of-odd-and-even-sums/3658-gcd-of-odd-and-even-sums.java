class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int even = 0;
        for(int i=1;i<=n*2;i++){
            if(i%2 == 0) even += i;
            else odd += i;
        }
        // int min = Math.min(odd,even);
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=odd;i++){
            if(odd%i == 0 && even%i == 0){
                max = Math.max(i,max);
            }
        }
        return max;
    }
}