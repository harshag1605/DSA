class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // int target = n;
        helper(k,n,arr,ans,temp,0);
        return ans;

    }
    public void helper(int k, int n, int[] arr, List<List<Integer>> ans, List<Integer> temp, int idx){
        if(temp.size()==k && n==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(temp.size() > k){
            return;
        }
        if(idx>=9){
            return;
        }
        if(n < 0){
            return;
        }
        temp.add(arr[idx]);
        helper(k,n-arr[idx],arr,ans,temp,idx+1);

        temp.remove(temp.size()-1);
        helper(k,n,arr,ans,temp,idx+1);
    }
}