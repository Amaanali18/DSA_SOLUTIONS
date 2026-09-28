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
    public int ans = 0;
    public int goodNodes(TreeNode root) {
        int max = root.val;
        countgood(root,max);
        return ans;
    }
    public void countgood(TreeNode root , int max){
        if(root.val >= max){
            ans++;
        }
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left!=null){
            countgood(root.left , Math.max(max , root.val));
        }
        if(root.right!=null){
            countgood(root.right , Math.max(max , root.val));
        }
    }
}