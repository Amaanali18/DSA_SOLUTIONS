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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean even = true;
        while (!q.isEmpty()) {
            int size = q.size();
            int last = even ? 0 : Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                if (even) {
                    if (n.val % 2 == 0 || n.val <= last)
                        return false;
                } else {
                    if (n.val % 2 == 1 || n.val >= last)
                        return false;
                }
                last = n.val;
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
            }
            even = !even;
        }
        return true;
    }
}