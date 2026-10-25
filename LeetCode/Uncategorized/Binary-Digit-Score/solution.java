class Solution {
    public int calculateScore(int a, int b) {
        int score = 0;
        int m = bitScore(a);
        int n = bitScore(b);
        if(m>=n){
            score = (m*n);
        }else{
            score = (n/m);
        }
        return score;
    }
    public int bitScore(int x){
        int score = 0;
        while(x!=0){
            if(x%2==1){
                score++;
                x--;
            }else{
                x/=2;
            }
        }
        return score;
    }
}