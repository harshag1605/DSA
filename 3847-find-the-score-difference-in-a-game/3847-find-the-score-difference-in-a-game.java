class Solution {
    public int scoreDifference(int[] nums) {
        boolean active = true;
        boolean inactive = false;
        int asum = 0;
        int isum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 1){
                if(active){
                    active = false;
                    inactive = true;
                }
                else{
                    active = true;
                    inactive = false;
                }
            }
            if(i%6 == 5){
                if(active){
                    active = false;
                    inactive = true;
                }
                else{
                    active = true;
                    inactive = false;
                }
            }
            if(active)asum += nums[i];
            else{
                isum += nums[i];
            }
        }
        return asum-isum;
    }
}