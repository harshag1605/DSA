class Solution {
    static boolean isPrime(int n){
        if(n < 2)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0)return false;
        }
        return true;
    }
    static int countPrime(int n){
        int count = 0;
        while(n != 0){
            int rem = n%2;
            if(rem == 1)count++;
            n /= 2;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i=left;i<=right;i++){
            int c = countPrime(i);
            if(isPrime(c)){
                res++;
            }
        }
        return res;
    }
}