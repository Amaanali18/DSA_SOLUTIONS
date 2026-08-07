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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = constructT(nums,0,nums.length-1);
        return root;
    }
    public TreeNode constructT(int[] nums,int i,int j){
        if(i > j){
            return null;
        }
        int n = i+(j-i)/2;
        TreeNode root = new TreeNode(nums[n]);
        root.left = constructT(nums,i,n-1);
        root.right = constructT(nums,n+1,j);
        return root;
    }
}