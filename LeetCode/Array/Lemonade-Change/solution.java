class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0 , t = 0;
        for(int x : bills){
            if(x==5){
                f++;
            }else if(x==10){
                if(f<1) return false;
                f--;
                t++;
            }else{
                if(t>0 && f>0){
                    f--;
                    t--;
                }else if(f>=3){
                    f-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}