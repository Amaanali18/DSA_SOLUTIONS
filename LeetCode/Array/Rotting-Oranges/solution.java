class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<List<Integer>> q = new LinkedList<>();
        int count = 0 , m = grid.length , n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new ArrayList<>(Arrays.asList(i,j)));
                }else if(grid[i][j]==1){
                    count++;
                }
            }
        }
        int t = 0;
        while(!q.isEmpty() && count>0){
            int s = q.size();
            for(int i=0;i<s;i++){
                List<Integer> l = q.poll();
                int x = l.get(0) , y = l.get(1);
                if(x>0 && grid[x-1][y]==1){
                    grid[x-1][y]=2;
                    q.add(new ArrayList<>(Arrays.asList(x-1,y)));
                    count--;
                }
                if(y>0 && grid[x][y-1]==1){
                    grid[x][y-1]=2;
                    q.add(new ArrayList<>(Arrays.asList(x,y-1)));
                    count--;
                }
                if(x<m-1 && grid[x+1][y]==1){
                    grid[x+1][y]=2;
                    q.add(new ArrayList<>(Arrays.asList(x+1,y)));
                    count--;
                }
                if(y<n-1 && grid[x][y+1]==1){
                    grid[x][y+1]=2;
                    q.add(new ArrayList<>(Arrays.asList(x,y+1)));
                    count--;
                }
            }
            t++;
        }
        return count==0?t:-1;
    }
}