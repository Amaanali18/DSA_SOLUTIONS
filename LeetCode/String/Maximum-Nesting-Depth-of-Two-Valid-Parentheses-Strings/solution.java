class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        int d = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<ans.length ; i++){
            char c = seq.charAt(i);
            if(c == '('){
                ans[i] = d % 2;
                d++;
            }else{
                d--;
                ans[i] = d % 2;
            }
        }
        return ans;
    }
}