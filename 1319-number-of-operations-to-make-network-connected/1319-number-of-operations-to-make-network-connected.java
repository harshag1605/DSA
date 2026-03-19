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
                bfs(i,adj,vis);
                count++;
            }
        }
        return count-1;
    }

    void bfs(int src,List<List<Integer>> adj,boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src] = true;
        while(!q.isEmpty()){
            int p = q.poll();
            for(int neigh : adj.get(p)){
                if(!vis[neigh]){
                    q.add(neigh);
                    vis[neigh] = true;
                }
            }
        }
    }
}