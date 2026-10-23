class DSU{
    int[] p,s;
    DSU(int n){
        p = new int[n+1];
        s = new int[n+1];
        for(int i=0;i<=n;i++){
            p[i]=i;
            s[i]=1;
        }
    }
    int find(int x){
        if(p[x] == x) return x;
        return p[x]=find(p[x]);
    }
    boolean merge(int u,int v){
        int p1 = find(u);
        int p2 = find(v);
        if(p1==p2) return false;
        if (s[p1] < s[p2]) {
            int t = p1;
            p1 = p2;
            p2 = t;
        }
        p[p2] = p1;
        s[p1] += s[p2];

        return true;
    }
}
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        DSU dsu = new DSU(n);
        for(int[] row :edges){
            int x = row[0] , y = row[1];
            if(!dsu.merge(x,y)){
                return new int[]{x,y};
            }
        }
        return new int[]{};
    }
}
