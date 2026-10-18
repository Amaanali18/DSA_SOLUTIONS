class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length , n = grid[0].length;
        boolean[][] v = new boolean[m][n];
        int x = 0 , y = 0;
        v[x][y] = true;
        while(true){
            int lx = x , ly = y;

            switch(grid[x][y]){
                case 'L':
                    ly--;
                    break;
                case 'D':
                    lx++;
                    break;
                case 'R':
                    ly++;
                    break;
                case 'U':
                    lx--;
                    break;
                
            }

            if(lx<0 || ly<0 || lx>=m || ly>=n || v[lx][ly]){
                return new int[]{x,y};
            }


            x = lx;
            y = ly;
            v[x][y] = true;
        }
    }
}