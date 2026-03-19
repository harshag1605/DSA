class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        int n = graph.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        int src = 0;
        int dest = n-1;
        path.add(src);
        dfs(src,adj,path,ans,dest);

        return ans;
    }

    void dfs(int src,List<List<Integer>> adj,List<Integer> path,List<List<Integer>> ans,int dest){
        if(src == dest){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int neigh : adj.get(src)){
            path.add(neigh);
            dfs(neigh,adj,path,ans,dest);
            path.remove(path.size()-1);
        }
    }
}