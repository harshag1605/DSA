class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minInd = 0;
        int maxInd = 0;

        for(int i=0;i<n;i++){
            if(min > nums[i]){
                min = nums[i];
                minInd = i;
            }
            if(max < nums[i]){
                max = nums[i];
                maxInd = i;
            }
        }

        int left = Math.max(minInd, maxInd)+1;
        int right = n - Math.min(minInd,maxInd);

        int bothSide = (Math.min(minInd,maxInd) + 1) + (n - Math.max(minInd,maxInd));

        return Math.min(left, Math.min(right,bothSide));
    }
}