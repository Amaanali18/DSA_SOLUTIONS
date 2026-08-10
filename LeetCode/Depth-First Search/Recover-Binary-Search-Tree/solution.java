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
    TreeNode first;
    TreeNode mid;
    TreeNode last;
    public void recoverTree(TreeNode root) {
        helper(root);
        int temp = first.val;
        first.val = mid.val;
        mid.val = temp;
    }
    void helper(TreeNode node) {
        if (node == null) return;
        helper(node.left);
        if (last != null && last.val > node.val) {
            if (first == null) {
                first = last;
            }
            mid = node;
        }
        last = node;
        helper(node.right);
    }
}