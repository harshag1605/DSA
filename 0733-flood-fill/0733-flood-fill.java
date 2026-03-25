class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        boolean vis[][] = new boolean[n][m];
        int temp = image[sr][sc];
        dfs(image,vis,sr,sc,color,temp);
        return image;
    }
    void dfs(int[][] image, boolean[][] vis,int sr,int sc,int color,int temp){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || vis[sr][sc] || image[sr][sc] != temp){
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;
        
        dfs(image,vis,sr+1,sc,color,temp);
        dfs(image,vis,sr-1,sc,color,temp);
        dfs(image,vis,sr,sc+1,color,temp);
        dfs(image,vis,sr,sc-1,color,temp);
    }
}