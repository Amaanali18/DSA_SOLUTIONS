class Solution {
    Map<String, List<String>> parents = new HashMap<>();
    List<List<String>> ans = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return ans;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        boolean found = false;
        while (!q.isEmpty() && !found) {
            int size = q.size();
            Set<String> used = new HashSet<>();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                char[] arr = curr.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    char old = arr[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == old) continue;
                        arr[j] = c;
                        String next = new String(arr);
                        if (set.contains(next)) {
                            parents.computeIfAbsent(next, k -> new ArrayList<>()).add(curr);
                            if (used.add(next)) q.add(next);
                            if (next.equals(endWord)) found = true;
                        }
                    }
                    arr[j] = old;
                }
            }
            set.removeAll(used);
        }
        if (found) {
            path.add(endWord);
            dfs(endWord, beginWord);
        }
        return ans;
    }
    void dfs(String curr, String beginWord) {
        if (curr.equals(beginWord)) {
            List<String> res = new ArrayList<>(path);
            Collections.reverse(res);
            ans.add(res);
            return;
        }
        for (String parent : parents.getOrDefault(curr, new ArrayList<>())) {
            path.add(parent);
            dfs(parent, beginWord);
            path.remove(path.size() - 1);
        }
    }
}