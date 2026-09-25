class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        HashSet<List<Integer>> ans = new HashSet<>();
        recurse(c,0,t,0,new ArrayList<>(),ans);
        return new ArrayList<>(ans);
    }
    public void recurse(int[] c , int i , int t , int s , List<Integer> curr , HashSet<List<Integer>> ans){
        if(s==t){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i>=c.length || s>t) return;
        curr.add(c[i]);
        recurse(c, i + 1, t, s + c[i], curr, ans);
        curr.remove(curr.size() - 1);
        int j = i + 1;
        while (j < c.length && c[j] == c[i]) j++;
        recurse(c, j, t, s, curr, ans);
    }
}