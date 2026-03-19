class Solution {
    public int pivotInteger(int n) {
        int[] pre = new int[n+1];
        int[] suf = new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i] = i+pre[i-1];
        }
        suf[n] = n;
        for(int i=n-1;i>=0;i--){
            suf[i] = i+suf[i+1];
        }

        for(int i=1;i<=n;i++){
            if(pre[i] == suf[i]){
                return i;
            }
        }
        return -1;
    }
}