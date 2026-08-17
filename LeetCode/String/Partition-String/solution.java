class Solution {
    public List<String> partitionString(String s) {
        HashSet<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        String curr = "";
        for(char c : s.toCharArray()){
            curr += c;
            if(!set.contains(curr)){
                set.add(curr);
                ans.add(curr);
                curr = "";
            }
        }
        return ans;
    }
}