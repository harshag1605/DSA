/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> m = new TreeMap<>();
        fun(root,m,0,0);
        List<List<Integer>> ans = new ArrayList<>();
        for(int p : m.keySet()){
            List<Integer> l = new ArrayList<>();
            TreeMap<Integer,List<Integer>> lvl = m.get(p);
            for(List<Integer> nodes : lvl.values()){
                Collections.sort(nodes);
                l.addAll(nodes);
            }
            ans.add(l);
        }
        return ans;
    }

    void fun(TreeNode root,TreeMap<Integer,TreeMap<Integer,List<Integer>>> m,int row,int col){
        if(root == null)return;
        TreeMap<Integer,List<Integer>> p = m.computeIfAbsent(col,k -> new TreeMap<>());
        List<Integer> l = p.computeIfAbsent(row,k -> new ArrayList<>());
        l.add(root.val);
        fun(root.left,m,row+1,col-1);
        fun(root.right,m,row+1,col+1);
    }
}