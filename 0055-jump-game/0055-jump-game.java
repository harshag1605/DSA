class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int dist = i+nums[i];
            if(max<i){
                return false;
            }
            max = Math.max(max,dist);
        }
        return true;
    }
}