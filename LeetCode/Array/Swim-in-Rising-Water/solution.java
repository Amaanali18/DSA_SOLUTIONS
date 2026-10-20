class Solution {
    public int swimInWater(int[][] grid) {
        int time = 0 , n = grid.length;
        Set<Integer> visited = new HashSet<>();
        while(!visited.contains(n*n - 1)){
            visited.clear();
            dfs(grid,n,0,0,time,visited);
            time++;
        }
        return time-1;
    }
    private int[] dir = {0,-1,0,1,0};
    private void dfs(int[][] grid,int n,int i,int j,int t,Set<Integer> set){
        if(i<0 || j<0 || i>n-1 || j>n-1 || set.contains(i*n+j) || grid[i][j]>t) return;
        set.add(i*n+j);
        for(int k=0;k<4;k++) dfs(grid,n,i+dir[k],j+dir[k+1],t,set);
    }
}