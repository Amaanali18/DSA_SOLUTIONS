class Solution {
    public long calculateScore(String s) {
        int n = s.length();
        Deque<Integer>[] stacks = new ArrayDeque[26];
        for (int i = 0; i < 26; i++) {
            stacks[i] = new ArrayDeque<>();
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            int mirror = 25 - c;
            if (!stacks[mirror].isEmpty()) {
                int j = stacks[mirror].pop();
                ans += (i - j);
            } else {
                stacks[c].push(i);
            }
        }
        return ans;
    }
}