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
    public int amountOfTime(TreeNode root, int start) {
        TreeNode target = null;
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<Integer,TreeNode> map = new HashMap<>();
        map.put(root.val,new TreeNode(-1));
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t.val == start){
                target = t;
            }
            if(t.left!=null){
                map.put(t.left.val,t);
                q.offer(t.left);
            }
            if(t.right!=null){
                map.put(t.right.val,t);
                q.offer(t.right);
            }
        }
        q.offer(target);
        int time = -1;
        HashSet<Integer> visited = new HashSet<>();
        visited.add(target.val);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode s = q.poll();
                TreeNode t = map.get(s.val);
                if(t!=null && t.val!=-1 && !visited.contains(t.val)){
                    visited.add(t.val);
                    q.offer(t);
                }
                if(s.left!=null && !visited.contains(s.left.val)){
                    visited.add(s.left.val);
                    q.offer(s.left);
                }
                if(s.right!=null && !visited.contains(s.right.val)){
                    visited.add(s.right.val);
                    q.offer(s.right);
                }
            }
            time++;
        }
        return time;
    }
}