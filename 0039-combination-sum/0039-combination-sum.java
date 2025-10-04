class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sum(res,temp,target,candidates,0);
        return res;

    }
    public static void sum(List<List<Integer>> res, List<Integer> temp, int target,int[] candidates, int idx){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(idx == candidates.length || target < 0){
            return;
        }
        // include
        temp.add(candidates[idx]);
        sum(res,temp,target-candidates[idx],candidates,idx);

        //exclude
        temp.remove(temp.size()-1);
        sum(res,temp,target,candidates,idx+1);
    }
}