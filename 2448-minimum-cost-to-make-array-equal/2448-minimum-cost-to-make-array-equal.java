class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        long[][] arr = new long[n][2];
        if(n==1) return 0;
        
        for(int i=0;i<n;i++){
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
        }
        
        Arrays.sort(arr,(a,b) -> Long.compare(a[0],b[0]));

        long[] pre = new long[n];
        long[] suf = new long[n];
        long left = 0;
        long right = 0;
        for(int i=1;i<n;i++){
            left += arr[i-1][1];
            pre[i] = ((arr[i][0]-arr[i-1][0]) * left) + pre[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right += arr[i+1][1];
            suf[i] = ((arr[i+1][0]-arr[i][0]) * right) + suf[i+1];
        }
        long min = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(pre[i]+suf[i], min);
        }
        return min;
    }
}