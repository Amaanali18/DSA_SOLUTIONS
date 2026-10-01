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
    public int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sums(root,low,high);
        return sum;
    }
    public void sums(TreeNode root, int low, int high){
        if(root==null) return;
        if(low<=root.val && root.val<=high){
            sum += root.val;
        }
        sums(root.left,low,high);
        sums(root.right,low,high);
    }
}