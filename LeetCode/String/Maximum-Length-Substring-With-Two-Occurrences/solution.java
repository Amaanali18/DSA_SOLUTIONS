class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0 , r = 0 , ans = 0 , k = 2;
        for(;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(l<r && map.get(s.charAt(r))>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}