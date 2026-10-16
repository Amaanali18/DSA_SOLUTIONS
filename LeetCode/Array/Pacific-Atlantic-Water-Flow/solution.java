class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length , n = heights[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        boolean a[][] = new boolean[m][n];
        boolean p[][] = new boolean[m][n];
        for (int i = 0; i < m; i++)
            dfs(i, 0, p, heights);

        for (int j = 0; j < n; j++)
            dfs(0, j, p, heights);

        for (int i = 0; i < m; i++)
            dfs(i, n - 1, a, heights);

        for (int j = 0; j < n; j++)
            dfs(m - 1, j, a, heights);
            
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(p[i][j] && a[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }

    public void dfs(int x, int y, boolean[][] visited, int[][] heights) {
        visited[x][y] = true;

        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        for (int[] d : dirs) {
            int nx = x + d[0];
            int ny = y + d[1];

            if (nx < 0 || ny < 0 ||
                    nx >= heights.length || ny >= heights[0].length)
                continue;

            if (visited[nx][ny])
                continue;

            if (heights[nx][ny] >= heights[x][y]) {
                dfs(nx, ny, visited, heights);
            }
        }
    }
}