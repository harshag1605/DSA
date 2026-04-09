class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j});
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }

        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];

            for(int[] d : dir){
                int ni = i+d[0];
                int nj = j+d[1];
                if(ni>=0 && ni<n && nj>=0 && nj<m && mat[ni][nj] == -1){
                    mat[ni][nj] = mat[i][j]+1;
                    q.add(new int[]{ni,nj});
                }
            }
        }
        return mat;
    }
}