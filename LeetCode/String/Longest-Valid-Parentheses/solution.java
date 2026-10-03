class Solution {
    public int longestValidParentheses(String s) {
        int count = 0 , n = s.length();
        if(s=="") return count;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    count = Math.max(count,i-st.peek());
                }
            }
        }
        return count;
    }
}