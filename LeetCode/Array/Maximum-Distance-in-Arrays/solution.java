class Solution {
    public int maxDistance(List<List<Integer>> a) {
        int ans = 0;
        int min = a.get(0).get(0);
        int max = a.get(0).get(a.get(0).size()-1);
        for(int i=1;i<a.size();i++){
            int first = a.get(i).get(0);
            int last = a.get(i).get(a.get(i).size()-1);
            ans = Math.max(ans,Math.max(last-min,max-first));
            min=Math.min(min,first);
            max=Math.max(max,last);
        }
        return ans;
    }
}