class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sum(res,temp,candidates,target,0);
        return res;
    }
    public static void sum(List<List<Integer>> res, List<Integer> temp,int[] candidates,int target,int start){
        if(target < 0){
            return;
        }
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            temp.add(candidates[i]);
            sum(res,temp,candidates,target-candidates[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}