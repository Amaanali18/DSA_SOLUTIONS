class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        int n = beginWord.length();
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int ans = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                String s = q.poll();
                if(s.equals(endWord)) return ans; 
                StringBuilder temp = new StringBuilder(s);
                for(int j=0;j<temp.length();j++){
                    for(int k=0;k<26;k++){
                        char c = temp.charAt(j);
                        temp.setCharAt(j,(char)(k+'a'));
                        if(set.contains(temp.toString())){
                            q.add(temp.toString());
                            set.remove(temp.toString());
                        }
                        temp.setCharAt(j,c);
                    }
                }
            }
            ans++;
        }
        return 0;
    }
}