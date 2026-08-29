class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1) c++;
            }
            arr[i] = c;
            max = Math.max(c,max);
        }
        
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            if(arr[i] == max){
                ans[0] = i;
                ans[1] = max;
                break;
            }
        }
        return ans;
    }
}