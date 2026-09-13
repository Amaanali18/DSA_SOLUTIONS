class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<n;i++){
            int r = rowShift[i];
            int[] t = new int[n];
            for(int j=0;j<n;j++){
                t[j] = grid[i][(j + r) % n];
            }
            grid[i] = t;
        }
        for(int i=0;i<n;i++){
            int c=colShift[i];
            int[] t = new int[n];
            for(int j=0;j<n;j++){
                t[j] = grid[(j + c) % n][i];
            }
            for (int k = 0; k < n; k++) {
                grid[k][i] = t[k];
            }
        }
        return grid;
    }
}