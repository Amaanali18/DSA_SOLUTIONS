class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder ans = new StringBuilder();
        int r = 0, c = 0;
        for (char ch : target.toCharArray()) {
            int x = (ch - 'a') / 5;
            int y = (ch - 'a') % 5;
            if (ch == 'z') {
                while (r > x) {
                    ans.append('U');
                    r--;
                }
                while (c > y) {
                    ans.append('L');
                    c--;
                }
            }
            while (r < x) {
                ans.append('D');
                r++;
            }
            while (c > y) {
                ans.append('L');
                c--;
            }
            while (r > x) {
                ans.append('U');
                r--;
            }
            while (c < y) {
                ans.append('R');
                c++;
            }
            ans.append('!');
        }
        return ans.toString();
    }
}