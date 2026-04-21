class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        helper(set,temp,0,nums);
        for(List<Integer> i : set){
            res.add(i);
        }
        return res;

    }
    void helper(HashSet<List<Integer>> set, List<Integer> temp, int ind, int[] nums){
        if(ind == nums.length){
            set.add(new ArrayList<>(temp));
            return;
        }
        //include
        temp.add(nums[ind]);
        helper(set,temp,ind+1,nums);

        //exclude
        temp.remove(temp.size()-1);
        helper(set,temp,ind+1,nums);
    }
}