class Solution {
    public int maxScore(int[] c, int k) {
        int n = c.length;
        int sum = 0 , max = 0;
        if(n==k){
            for(int x : c) sum+=x;
            return sum;
        }
        for(int i=0;i<k;i++){
            sum+=c[i];
        }
        max = sum;
        for(int i=k-1;i>=0;i--){
            sum -= c[i];
            sum += c[n-k+i];
            max=Math.max(max,sum);
        }
        return max;
    }
}