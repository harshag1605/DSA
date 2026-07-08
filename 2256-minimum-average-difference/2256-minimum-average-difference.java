class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for(int i=0;i<n;i++)sum += nums[i];
        long sleft=0;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            sleft += nums[i];
            sum -= nums[i];
            long right_avg = (i==n-1)?0: (sum/(n-1-i));
            long ans = Math.abs((sleft/(i+1)) - right_avg);
            res[i] = (int)ans;
        }
        long min = res[0];
        int idx = 0;
        for(int i=1;i<n;i++){
            if(min > res[i]){
                min = res[i];
                idx = i;
            }
        }
        return idx;
    }
}