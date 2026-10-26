class Solution {
    public int countIslands(int[][] grid, int k) {
        int count = 0 , m = grid.length , n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    long sum = dfs(grid,i,j,0);
                    if(sum%k == 0) count++;
                }
            }
        }
        return count;
    }
    public long dfs(int[][] grid,int i,int j,long sum){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return sum;
        sum += grid[i][j];
        grid[i][j] = 0;
        sum = dfs(grid,i+1,j,sum);
        sum = dfs(grid,i-1,j,sum);
        sum = dfs(grid,i,j+1,sum);
        sum = dfs(grid,i,j-1,sum);
        return sum;
    }
}