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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;
        boolean found = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr = q.poll();
                if(found == false){
                    list.add(curr.val);
                    if(curr.right != null)q.add(curr.right);
                    if(curr.left != null)q.add(curr.left);
                    found = true;
                }
                else{
                    list.add(curr.val);
                    if(curr.left != null)q.add(curr.left);
                    if(curr.right != null)q.add(curr.right);
                    found = false;
                }
            }
            res.add(list);
        }
        return res;
    }
}