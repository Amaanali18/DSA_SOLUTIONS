class Solution {
    public boolean flag = true;
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] v = new int[n];
        Arrays.fill(v,-1);
        for(int i=0;i<n;i++){
            if(v[i]==-1){
                v[i]=0;
                dfs(i,graph,v);
            }
            if(!flag) return false;
        }
        return true;
    }
    public void dfs(int i,int[][] g,int[] v){
        if(!flag) return;
        for(int c : g[i]){
            if(v[i]==v[c]){
                flag = false;
                return;
            }
            if(v[c] == -1){
                v[c]= 1-v[i];
                dfs(c,g,v);
            }
        }
    }
}