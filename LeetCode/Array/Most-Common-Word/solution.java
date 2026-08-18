class Solution {
    public String mostCommonWord(String p, String[] b) {
        p = p.toLowerCase();
        String[] words = p.split("[ !?',;.]+");
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(String x : b){
            set.add(x);
        }
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        String ans = "";
        int count = 0;
        for(String key : map.keySet()){
            if(!set.contains(key) && map.get(key)>count){
                ans = key;
                count = map.get(key);
            }
        }
        return ans;
    }
}