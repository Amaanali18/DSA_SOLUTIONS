class Solution {
    public String findValidPair(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n-1;i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            if(a!=b && (map.get(a) == a - '0') && (map.get(b) == b - '0')){
                return (""+a+b);
            }
        }
        return "";
    }
}