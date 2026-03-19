class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0,graph,new ArrayList<>(),res);
        return res;
    }
    void dfs(int src,int[][] g,List<Integer> path,List<List<Integer>> ans){
        path.add(src);
        if(src == g.length-1){
            ans.add(new ArrayList<>(path));
        }
        for(int neigh : g[src]){
            dfs(neigh,g,path,ans);
        }
        path.remove(path.size()-1);
    }
}