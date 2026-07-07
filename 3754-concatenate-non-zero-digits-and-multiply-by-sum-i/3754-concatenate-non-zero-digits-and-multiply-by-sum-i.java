class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return 0;
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        int rem = 0;
        while(n != 0){
            int a = n%10;
            if(a != 0){
                rem = a + (rem*10);
            }
            n /= 10;
        }
        while(rem != 0){
            sb.append(rem%10);
            sum += rem%10;
            rem /= 10;
        }
        long ans = Long.parseLong(sb.toString());
        return ans*sum;
    }
}