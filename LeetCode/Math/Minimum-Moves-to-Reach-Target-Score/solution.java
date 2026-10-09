class Solution {
    public int minMoves(int t, int d) {
        int a = 0;
        while(t>1){
            if(d>0 && t%2==0){
                a++;
                d--;
                t/=2;
            }else{
                if(d>0){
                    a++;
                    t--;
                }else{
                    return a+t-1;
                }
            }
        }
        return a;
    }
}