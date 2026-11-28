class Solution {
    public int mod = 1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        return memo(n,k,target,dp);
    }
    public int memo(int n,int k,int t,int[][] dp){
        if(n==0 && t==0) return 1;
        if(dp[n][t] != -1) return dp[n][t];
        int ways = 0;
        for(int i=1;i<=k;i++){
            if(t>=i && n>0){
                ways = (ways + memo(n-1,k,t-i,dp))%mod;
            }
        }
        return dp[n][t] = ways;
    }
}