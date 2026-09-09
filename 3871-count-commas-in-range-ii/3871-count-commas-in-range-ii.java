class Solution {
    public long countCommas(long n) {
        long large = 999;
        long x = 0;

        while(n>=large){
            x += n-large;
            large = (large*1000)+999;
        }
        return x;
    }
}