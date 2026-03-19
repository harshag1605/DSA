class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1)fresh++;
            }
        }
        if(fresh == 0)return 0;
        int m = 0;
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            m++;
            int size = q.size();
            while(size-- > 0){
                int f[] = q.poll();
                for(int d[] : dir){
                    int x = f[0]+d[0];
                    int y = f[1]+d[1];
                    if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]==2 || grid[x][y]==0)continue;
                    fresh--;
                    grid[x][y] = 2;
                    if(fresh == 0)return m;
                    q.add(new int[]{x,y});
                }
            }
        }
        return -1;
    }
}