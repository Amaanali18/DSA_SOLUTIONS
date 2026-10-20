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
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(root,t,new ArrayList<>(),ans);
        return ans;
    }
    public void sum(TreeNode root,int t,List<Integer> curr,List<List<Integer>> ans){
        if(root==null) return;
        curr.add(root.val);
        t-=root.val;
        if (root.left == null && root.right == null) {
            if (t == 0) ans.add(new ArrayList<>(curr));
        } else {
            sum(root.left, t, curr, ans);
            sum(root.right, t, curr, ans);
        }
        curr.remove(curr.size() - 1);
    }
}