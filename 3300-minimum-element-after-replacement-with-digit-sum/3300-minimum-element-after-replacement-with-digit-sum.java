class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            nums[i] = digitsum(nums[i]);
            min = Math.min(min,nums[i]);
        }
        return min;
    }
    public int digitsum(int x){
        int sum = 0;
        while(x != 0){
            sum += x%10;
            x /= 10;
        }
        return sum;
    }
}