class Solution {
    public int findCircleNum(int[][] e) {
        boolean[] visited = new boolean[e.length];
        int count = 0;
        for(int i=0;i<e.length;i++){
            if(!visited[i]){
                dfs(e,visited,i);
                count++;
            }
        }
        return count;
    }
    public void dfs(int[][] e,boolean[] visited,int i){
        for(int j=0;j<e.length;j++){
            if(!visited[j] && e[i][j]==1){
                visited[j] = true;
                dfs(e,visited,j);
            }
        }
    }
}