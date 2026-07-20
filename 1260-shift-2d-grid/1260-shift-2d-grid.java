class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int elements = n*m;
        k = k%elements;
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = new int[elements];
        int idx = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++] = grid[i][j]; 
            }
        }
        reverse(arr,0,elements-1);
        reverse(arr,0,k-1);
        reverse(arr,k,elements-1);

        idx = 0;
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<m;j++){
                ans.get(i).add(arr[idx++]);
            }
        }
        return ans;
    }
    public void reverse(int[] arr,int i,int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}