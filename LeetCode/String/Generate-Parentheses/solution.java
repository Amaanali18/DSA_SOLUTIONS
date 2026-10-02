class Solution {
    public List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(n - 1, n, new StringBuilder("("));
        return ans;
    }
    public void generate(int i, int j, StringBuilder str) {
        if (i == 0 && j == 0) {
            ans.add(str.toString());
            return;
        }
        if (i > 0) {
            str.append('(');
            generate(i - 1, j, str);
            str.deleteCharAt(str.length() - 1);
        }
        if (j > i) {
            str.append(')');
            generate(i, j - 1, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}