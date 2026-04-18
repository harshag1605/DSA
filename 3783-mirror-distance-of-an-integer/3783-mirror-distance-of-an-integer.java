class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int rem = 0;
        while(n!=0){
            int a = n%10;
            rem = a+(rem*10);
            n /= 10;
        }
        return Math.abs(rem-temp);
    }
}