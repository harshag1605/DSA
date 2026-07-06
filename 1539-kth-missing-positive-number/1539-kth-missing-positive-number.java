class Solution {
    public int findKthPositive(int[] arr, int k) {
        int c = 0;
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(true){
            if(i<n && arr[i] == j){
                i++;
                j++;
            }
            else{
                j++;
                c++;
            }
            if(c==k) break;
        }
        return j-1;
    }
}