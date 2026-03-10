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
    public TreeNode searchBST(TreeNode root, int val) {
        List<TreeNode> ans = new ArrayList<>();
        fun(root,ans);
        for(TreeNode n : ans){
            if(n.val == val)return n;
        }
        return null;
    }
    void fun(TreeNode root, List<TreeNode> ans){
        if(root == null)return;
        fun(root.left,ans);
        ans.add(root);
        fun(root.right,ans);
    }
}