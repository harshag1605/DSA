class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        pair(res,temp,arr,0,k,n);
        return res;
    }
    void pair(List<List<Integer>> res, List<Integer> temp,int[] arr,int idx,int k,int n){
        if(temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            pair(res,temp,arr,i+1,k,n);
            temp.remove(temp.size()-1);
        }
    }
}