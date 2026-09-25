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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int lvl = queue.size();
            List<Integer> curr = new ArrayList<>();
            for(int i=0;i<lvl;i++){
                TreeNode node = queue.poll();
                curr.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            ans.add(curr);
        }
        for(List<Integer> curr : ans){
            Double s = 0D;
            for(int x : curr){
                s+=x;
            }
            s /= curr.size();
            res.add(s);
        }
        return res;
    }
}