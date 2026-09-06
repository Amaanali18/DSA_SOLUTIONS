class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length , k = n/2 , ans = 0;
        int[] cir = new int[2*n];
        for(int i=0;i<n;i++){
            cir[i] = nums[i];
            cir[n+i] = nums[i];
        }
        int fl = 0 , fh = 0 , sl = k , sh = k ;
        long fs = 0 , ss = 0;
        for(;fh<k;fh++){
            fs+=cir[fh];
        }
        for(;sh<n;sh++){
            ss+=cir[sh];
        }
        if(fs > ss) ans++;
        for(int i=0;i<n-1;i++){
            fs-=cir[fl++];
            fs+=cir[fh++];
            ss-=cir[sl++];
            ss+=cir[sh++];
            if(fs > ss) ans++;
        }
        return ans;
    }
}