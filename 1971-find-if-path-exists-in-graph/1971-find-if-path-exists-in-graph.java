class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[] = new boolean[n];
        return dfs(source,destination,vis,adj);
    }
    static boolean dfs(int curr,int destination,boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        if(curr == destination)return true;
        vis[curr] = true;

        for(int neigh : adj.get(curr)){
            if(!vis[neigh]){
                if(dfs(neigh,destination,vis,adj)){
                    return true;
                }
            }
        }
        return false;
    }
}