class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates,target,0,res,temp);
        return res;
    }
    public void helper(int[] candidates, int target, int idx, List<List<Integer>> res, List<Integer> temp){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(idx >= candidates.length || target < 0) return;

        //include
        temp.add(candidates[idx]);
        helper(candidates,target-candidates[idx], idx+1,res,temp);

        while(idx+1 < candidates.length && candidates[idx] == candidates[idx+1]){
            idx++;
        }

        //exlcude
        temp.remove(temp.size()-1);
        helper(candidates,target,idx+1,res,temp);
    }
}