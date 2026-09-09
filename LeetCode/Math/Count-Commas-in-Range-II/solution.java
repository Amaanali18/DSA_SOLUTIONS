class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long ans = 0;
        long left = 1000;
        long comma = 1;
        while(left<=n){
            long count = Math.min(n,((left*1000)-1));
            ans += (count-left+1)*comma;
            left*=1000;
            comma++;
        }
        return ans;
    }
}