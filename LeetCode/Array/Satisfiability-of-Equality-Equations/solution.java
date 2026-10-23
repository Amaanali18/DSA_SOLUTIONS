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
    void merge(int u,int v){
        int p1 = find(u);
        int p2 = find(v);
        if(p1==p2) return;
        if (s[p1] < s[p2]) {
            int t = p1;
            p1 = p2;
            p2 = t;
        }
        p[p2] = p1;
        s[p1] += s[p2];
    }
}
class Solution {
    public boolean equationsPossible(String[] e) {
        DSU dsu = new DSU(25);
        for(String s : e){
            int x = s.charAt(0) - 'a';
            int y = s.charAt(3) - 'a';
            if(s.charAt(1)=='=') dsu.merge(x,y);
        }
        for(String s : e){
            int x = s.charAt(0) - 'a';
            int y = s.charAt(3) - 'a';
            if(s.charAt(1)=='!') if(dsu.find(x)==dsu.find(y)) return false;
        }
        return true;
    }
}