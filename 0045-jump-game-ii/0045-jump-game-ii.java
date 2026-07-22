class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int steps = 0;
        int reach = 0;
        int curr = 0;
        for(int i=0;i<n-1;i++){
            reach = Math.max(reach, i+nums[i]);
            
            if(i==curr){
                steps++;
                curr = reach;
            }
        }
        return steps;
    }
}