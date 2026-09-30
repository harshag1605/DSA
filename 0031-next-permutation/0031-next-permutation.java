class Solution {
    public void nextPermutation(int[] nums) {
        int j=-1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                j=i;
                break;
            }
        }
        int i=n-1;
        if(j>=0){
            while(i>=0){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
                i--;
            }
        }
        i=n-1;
        int k = j+1;
        while(i>j && k<i){
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            i--;
            k++;
        }
    }
}