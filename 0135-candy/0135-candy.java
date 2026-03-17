class Solution {
    public int candy(int[] rating) {
        int n = rating.length;
        if(n == 1)return 1;
        // int res[] = new int[n];
        int[] pre = new int[n];
        int[] suf = new int[n];
        // Arrays.fill(res,1);
        for(int i=0;i<n-1;i++){
            if(rating[i] > rating[i+1]){
                suf[i]++;
            }
        }
        for(int i=n-1;i>0;i--){
            if(rating[i] > rating[i-1]){
                pre[i]++;
            }
        }
        int sum = n;
        for(int i=0;i<n;i++){
            // sum += res[i];
            sum += Math.max(pre[i],suf[i]);
        }
        return sum;
    }
}