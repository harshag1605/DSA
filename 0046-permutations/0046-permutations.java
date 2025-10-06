class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        pairs(res,temp,nums,new boolean[nums.length]);
        return res;

    }
    void pairs(List<List<Integer>> res, List<Integer> temp, int nums[], boolean[] used){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);

            pairs(res,temp,nums,used);

            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}