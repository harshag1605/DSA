class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = n-1;
        while(i<j){
            int min = Math.min(height[i],height[j]);
            max = Math.max(min*(j-i),max);
            if(min == height[i])i++;
            else j--;
        }
        return max;
    }
}