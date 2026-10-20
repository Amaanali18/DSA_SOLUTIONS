class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        int[][] dist = new int[m][n];
        for(int[] r : dist){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        int[][] move = {{0,1},{1,0}};
        dist[0][0] = grid[0][0];
        pq.add(new int[]{dist[0][0],0,0});
        while(!pq.isEmpty()){
            int[] x = pq.poll();
            int a = x[0] , b=x[1] , c=x[2];
            if(a > dist[b][c]) continue;
            for(int[] r : move){
                int i = b+r[0];
                int j = c+r[1];
                if(i>=0 && j>=0 && i<m && j<n){
                    int nd = a+grid[i][j];
                    if(nd < dist[i][j]){
                        dist[i][j] = nd;
                        pq.add(new int[]{nd,i,j});
                    }
                }
            }
        }
        return dist[m-1][n-1];
    }
}