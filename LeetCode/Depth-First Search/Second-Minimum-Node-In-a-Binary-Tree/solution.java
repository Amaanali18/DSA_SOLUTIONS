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
    public int findSecondMinimumValue(TreeNode root) {
        return find(root,root.val);
    }
    public int find(TreeNode root,int val){
        if(root == null) return -1;
        if(root.val > val) return root.val;
        int x = find(root.left,val);
        int y = find(root.right,val);
        if(x == -1) return y;
        if(y == -1) return x;
        return Math.min(x,y);
    }
}