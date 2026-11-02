class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[n-1];
        if(n==1) return 0;
        int cnt = 0;
        int mid = nums[n/2];
        for(int i=0;i<n;i++){
            cnt += Math.abs(mid-nums[i]);
        }
        return cnt;
    }
}