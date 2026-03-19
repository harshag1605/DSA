class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean vis[] = new boolean[v];
        int count = 0;

        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(i,isConnected,vis);
                count++;
            }
        }
        return count;
    }
    void dfs(int src,int graph[][],boolean vis[]){
        vis[src] = true;
        for(int i=0;i<graph[0].length;i++){
            if(!vis[i] && graph[src][i] == 1){
                dfs(i,graph,vis);
            }
        }
    }
}