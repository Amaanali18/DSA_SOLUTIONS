class Solution {
    public boolean sumGame(String num) {
        int[] sum = {0,0} , q = {0,0};
        int n = num.length();
        for(int i=0;i<n;i++){
            int j = i / (n>>1);
            char c = num.charAt(i);
            if(c == '?') q[j]++;
            else sum[j] += (c - '0');
        }
        if(q[0] == q[1]) return sum[0] != sum[1];
        if((q[0] + q[1])%2 == 1) return true;
        return 2*(sum[0]-sum[1]) != 9*(q[1]-q[0]);
    }
}