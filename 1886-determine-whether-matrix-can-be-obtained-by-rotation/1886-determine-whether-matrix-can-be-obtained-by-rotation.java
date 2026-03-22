class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(isEqual(mat,target))return true;
            rotate(mat);
        }
        return false;
    }
    private void rotate(int[][] mat){
        int n = mat.length;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][n-1-i] = mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = arr[i][j];
            }
        }
    }
    boolean isEqual(int[][] mat,int[][] target){
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != target[i][j])return false;
            }
        }
        return true;
    }
}