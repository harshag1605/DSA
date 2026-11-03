class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int cnt = 0;
        for(int i : nums){
            cnt += max-i;
        }
        return cnt;
    }
}