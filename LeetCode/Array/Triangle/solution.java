class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],Integer.MAX_VALUE);
        return dfs(triangle,dp,0,0,n);
    }
    public int dfs(List<List<Integer>> triangle , int[][] dp , int i , int j , int n){
        if(i==n-1) return triangle.get(i).get(j);
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        return dp[i][j] = triangle.get(i).get(j) + Math.min(dfs(triangle,dp,i+1,j,n) , dfs(triangle,dp,i+1,j+1,n));
    }
}