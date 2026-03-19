class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean vis[] = new boolean[v];
        int count = 0;

        for(int i=0;i<v;i++){
            if(!vis[i]){
                count++;
                bfs(i,isConnected,vis);
            }
        }
        return count;
    }
    void bfs(int src,int graph[][],boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src] = true;
        while(!q.isEmpty()){
            int p = q.poll();
            for(int nb=0;nb<graph[0].length;nb++){
                if(graph[p][nb] == 1 && !vis[nb]){
                    vis[nb] = true;
                    q.add(nb);
                }
            }
        }
    }
}