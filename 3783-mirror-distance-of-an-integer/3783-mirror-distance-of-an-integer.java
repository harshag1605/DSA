class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }
    int reverse(int n){
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int a = n%10;
            sb.append(a);
            n /= 10;
        }
        return Integer.parseInt(sb.toString());
    }
}