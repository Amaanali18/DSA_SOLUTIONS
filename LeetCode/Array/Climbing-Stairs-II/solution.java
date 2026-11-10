class Solution {
    public int climbStairs(int n, int[] costs) {
        long[] dp = new long[n+1];
        Arrays.fill(dp,Long.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=3;k++){
                int j = i-k;
                if(j>=0){
                    long jump = (long)(i-j)*(i-j);
                    dp[i] = Math.min(dp[i] , dp[j] + costs[i-1] + jump);
                }
            }
        }
        return (int)(dp[n]);
    }
}