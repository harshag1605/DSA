class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int m = n;
        int product = 1;
        while(n != 0) {
            sum += n%10;
            product *= n%10;
            n /= 10;
        }
        int total = sum+product;
        return m%total == 0;
    }
}