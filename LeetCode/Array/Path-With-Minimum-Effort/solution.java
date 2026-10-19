class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length , n = heights[0].length;
        int[][] efforts = new int[m][n];
        for(int[] e : efforts){
            Arrays.fill(e,Integer.MAX_VALUE);
        }
        efforts[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2]-b[2]);
        int[] d = {0,-1,0,1,0};
        pq.offer(new int[3]);
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int x = curr[0] , y = curr[1] , effort = curr[2];
            if(x==m-1 && y==n-1) return effort;
            for(int k=0;k<4;k++){
                int i = x+d[k];
                int j = y+d[k+1];
                if(i>=0 && j>=0 && i<m && j<n){
                    int ne = Math.max(effort,Math.abs(heights[i][j]-heights[x][y]));
                    if(efforts[i][j] > ne){
                        efforts[i][j] = ne;
                        pq.offer(new int[]{i,j,ne});
                    }
                }
            }
        }
        return -1;
    }
}