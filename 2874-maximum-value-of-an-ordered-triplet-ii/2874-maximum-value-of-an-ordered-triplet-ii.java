class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        long maxBefore = nums[0];
        long maxDiff = 0;

        for(int j=1;j<nums.length;j++){
            ans = Math.max(ans, maxDiff * nums[j]);
            maxDiff = Math.max(maxDiff, maxBefore - nums[j]);
            maxBefore = Math.max(maxBefore, nums[j]);
        }
        return ans;
    }
}