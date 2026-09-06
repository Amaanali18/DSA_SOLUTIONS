class Solution {
    public int countGroups(int[] p, int[] s, int d) {
        int ans = 1 , n=p.length;
        int l=n-1 , r=n-1;
        for(int i=n-2;i>=0;i--){
            boolean dist = p[l]-p[i]<=d;
            boolean sped = s[i]>s[r];
            if(dist || sped){
                l=i;
            }else{
                ans++;
                l=r=i;
            }
        }
        return ans;
    }
}