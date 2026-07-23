class Solution {
    public static long mod = (int)(1e9 + 7);
    public int countGoodNumbers(long n) {
        long even = ((n+1)/2);
        long odd = (n/2);

        long total = (power(4, odd) * (power(5, even)))%mod;
        return (int)total;
    }
    public long power(long n, long x){
        if(x==0) return 1;
        long half = power(n,x/2);
        long ans = (half*half)%mod;

        if(x%2==1){
            ans = (half*half*n)%mod;
        }
        return ans;
    }
}