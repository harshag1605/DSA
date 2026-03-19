class Solution {
    public int makeConnected(int n, int[][] connections) {
        int v = connections.length;
        int count = 0;
        if(n-1 > v)return -1;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e: connections){
            int u = e[0];
            int V = e[1];
            adj.get(u).add(V);
            adj.get(V).add(u);
        }
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,adj,vis);
                count++;
            }
        }
        return count-1;
    }

    void dfs(int src,List<List<Integer>> adj,boolean[] vis){
        vis[src] = true;
        for(int neigh : adj.get(src)){
            if(!vis[neigh]){
                dfs(neigh,adj,vis);
            }
        }
    }
}