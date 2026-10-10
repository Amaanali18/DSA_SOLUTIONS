class Solution {
    public int findMinDifference(List<String> t) {
        int a = Integer.MAX_VALUE;
        int n = t.size();
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            String s = t.get(i);
            c[i] = Integer.parseInt(s.substring(0,2))*60 + Integer.parseInt(s.substring(3,5));
        }
        Arrays.sort(c);
        for(int i=1;i<n;i++){
            a = Math.min(a , c[i]-c[i-1]);
        }
        a = Math.min(a , c[0] + (24*60 - c[n-1]));
        return a;
    }
}