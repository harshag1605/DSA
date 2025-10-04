class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int idx = 0;
        subset(nums,res,temp,idx);
        return res;
    }
    public static void subset(int[] nums,List<List<Integer>> res,List<Integer> temp,int idx){
        if(idx == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        // include
        temp.add(nums[idx]);
        subset(nums,res,temp,idx+1);

        // exclude
        temp.remove(temp.size()-1);
        subset(nums,res,temp,idx+1);
    }
}