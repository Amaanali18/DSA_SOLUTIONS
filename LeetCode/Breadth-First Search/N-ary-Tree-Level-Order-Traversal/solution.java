/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> curr = new ArrayList<>();
            for(int i=0;i<s;i++){
                Node n = q.poll();
                curr.add(n.val);
                for(Node child : n.children){
                    q.add(child);
                }
            }
            ans.add(curr);
        }
        return ans;
    }
}