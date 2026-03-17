class Solution {
    public int candy(int[] rating) {
        int n = rating.length;
        if(n == 1)return 1;
        int[] pre = new int[n];
        int[] suf = new int[n];
        Arrays.fill(pre,1);
        Arrays.fill(suf,1);
        for(int i=1;i<n;i++){
            if(rating[i] > rating[i-1]){
                pre[i] = pre[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(rating[i] > rating[i+1]){
                suf[i] = suf[i+1]+1;
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.max(pre[i],suf[i]);
        }
        return sum;
    }
}