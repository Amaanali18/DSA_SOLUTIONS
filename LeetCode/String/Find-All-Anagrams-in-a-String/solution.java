class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()) return list;
        int[] map = new int[26];
        for(char c : p.toCharArray()){
            map[c - 'a']++;
        }
        int[] freq = new int[26];
        int i = 0, l = p.length();
        for (; i < l; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        if (check(freq, map)) list.add(0);
        for (i = 1; i + p.length() <= s.length(); i++) {
            freq[s.charAt(i + p.length() - 1) - 'a']++;
            freq[s.charAt(i - 1) - 'a']--;
            if (check(freq, map)) list.add(i);
        }
        return list;
    }
    public boolean check(int[] freq, int[] target) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != target[i])
                return false;
        }
        return true;
    }
}