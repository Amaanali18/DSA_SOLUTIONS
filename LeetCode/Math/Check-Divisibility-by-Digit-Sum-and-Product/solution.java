class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        long sum = 0 , mul = 1;
        while(t!=0){
            int r = t%10;
            sum += r;
            mul *= r;
            t/=10;
        }
        return (n%(sum+mul))==0;
    }
}