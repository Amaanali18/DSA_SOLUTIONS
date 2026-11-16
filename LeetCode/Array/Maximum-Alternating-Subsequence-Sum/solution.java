class Solution {
    long[][] dp;
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        dp = new long[n][2];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return recurse(0,0,nums);
    }
    public long recurse(int i , int s , int[] x){
        if(i>=x.length) return 0;
        if(dp[i][s]!=-1) return dp[i][s];
        long nt = recurse(i+1,s,x);
        long dt = 0;
        if(s==0){
            dt = recurse(i+1,1,x) + x[i];
        }else{
            dt = recurse(i+1,0,x) - x[i];
        }
        return dp[i][s] = Math.max(nt,dt);
    }
}