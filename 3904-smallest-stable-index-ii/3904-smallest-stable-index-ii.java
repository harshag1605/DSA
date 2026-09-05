class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] max = new int[n];
        int min[] = new int[n];

        int maxnum = 0;
        for(int i=0;i<n;i++){
            maxnum = Math.max(maxnum,nums[i]);
            max[i] = maxnum;
        }

        int minnum = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            minnum = Math.min(minnum,nums[i]);
            min[i] = minnum;
        }

        for(int i=0;i<n;i++){
            int x = max[i]-min[i];
            if(x <= k){
                return i;
            }
        }
        return -1;
    }
}