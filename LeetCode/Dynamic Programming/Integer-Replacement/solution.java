class Solution {
    public int integerReplacement(int n) {
        return replace((long)n,0);
    }
    public int replace(long n , int count){
        if(n==1) return count;
        if(n%2==0){
            return replace(n/2,count+1);
        }
        int l = replace(n+1,count+1);
        int r = replace(n-1,count+1);
        return Math.min(l,r);
    }
}