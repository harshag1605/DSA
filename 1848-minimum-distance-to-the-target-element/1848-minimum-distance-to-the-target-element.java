class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int dis = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                dis = Math.abs(i-start);
                min = Math.min(dis,min);
            }
        }
        return min;
    }
}