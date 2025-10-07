class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n/2;i++){
            int sum = nums[i] + nums[n-1-i];
            max = Math.max(sum,max);
        }
        return max;
    }
}