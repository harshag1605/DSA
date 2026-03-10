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
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        if(root == null)return 0;
        ArrayList<Integer> ans = new ArrayList<>();
        helper(ans,root.val,root);
        for(int i=0;i<ans.size();i++){
            sum += ans.get(i);
        }
        return sum;
    }
    static void helper(ArrayList<Integer> ans, int num, TreeNode root){
        if(root == null)return ;
        if(root.left == null && root.right == null){
            ans.add(num);
            return;
        }
        if(root.left != null){
            helper(ans,num*10+root.left.val,root.left);
        }
        if(root.right != null){
            helper(ans,num*10+root.right.val,root.right);
        }
    }
}