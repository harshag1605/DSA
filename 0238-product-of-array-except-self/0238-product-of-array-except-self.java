class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        pre[0] = 1;
        suff[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            pre[i] = nums[i-1]*pre[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            suff[j] = nums[j+1]*suff[j+1];
        }

        for(int i=0;i<nums.length;i++){
            pre[i] = pre[i]*suff[i];
        }
        return pre;
    }
}