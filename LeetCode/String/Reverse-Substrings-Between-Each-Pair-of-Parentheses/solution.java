class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push(i);
            } else if (str.charAt(i) == ')') {
                int j = st.pop();
                String temp = str.substring(j + 1, i);
                temp = new StringBuilder(temp).reverse().toString();
                str.replace(j, i + 1, temp);
                i = j + temp.length() - 1;
            }
        }
        return str.toString();
    }
}