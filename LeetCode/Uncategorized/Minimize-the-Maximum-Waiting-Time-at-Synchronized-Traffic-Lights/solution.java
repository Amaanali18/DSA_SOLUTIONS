class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max = 0 , ans = 0;
        for(int x : lights){
            if(x > max) max=x;
        }
        for(int t : arrivalTime){
            int r = t % period;
            int w = r<max?0:period-r;
            ans = Math.max(ans,w);
        }
        return ans;
    }
}