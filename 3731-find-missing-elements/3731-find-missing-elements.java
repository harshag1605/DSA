class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int idx = 1;
        int x = nums[0];
        List<Integer> ans = new ArrayList<>();
        for(int i=x+1;i<=nums[n-1];i++){
            if(nums[idx] != i){
                ans.add(i);
            }
            else{
                idx++;
            }
        }
        return ans;
    }
}