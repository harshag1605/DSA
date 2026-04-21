class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        helper(res,temp,0,nums);
        return res;

    }
    void helper(List<List<Integer>> res, List<Integer> temp, int i, int[] nums){
        if(i == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        //include
        temp.add(nums[i]);
        helper(res,temp,i+1,nums);

        int idx = i+1;
        //exclude
        temp.remove(temp.size()-1);
        while(idx < nums.length && nums[idx] == nums[idx-1]) idx++;
        helper(res,temp,idx,nums);
    }
}