class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int time = 0;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2)q.add(new int[]{i,j});
                if(grid[i][j] == 1)fresh++;
            }
        }

        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int size = q.size();
            boolean rotted = false;
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                for(int[] d : dir){
                    int ni = curr[0]+d[0];
                    int nj = curr[1]+d[1];
                    if(ni>=0 && ni<n && nj>=0 && nj<m && grid[ni][nj]==1){
                        grid[ni][nj] = 2;
                        fresh--;
                        q.add(new int[]{ni,nj});
                        rotted = true;
                    }
                }
            }
            if(rotted)time++;
        }
        if(fresh > 0)return -1;
        return time;
    }
}