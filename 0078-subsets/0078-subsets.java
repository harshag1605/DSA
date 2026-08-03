class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums,0,ans,temp);
        return ans;
    }
    public void helper(int[] nums, int idx, List<List<Integer>> ans, List<Integer> temp){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        helper(nums,idx+1,ans,temp);

        temp.remove(temp.size()-1);
        helper(nums,idx+1,ans,temp);
    }
}