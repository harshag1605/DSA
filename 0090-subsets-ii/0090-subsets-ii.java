class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums,ans,temp,0);
        return ans;   
    }
    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> temp, int idx){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        helper(nums,ans,temp,idx+1);

        temp.remove(temp.size()-1);
        while(idx+1<nums.length && nums[idx] == nums[idx+1]){
            idx++;
        }
        helper(nums,ans,temp,idx+1);
    }
}