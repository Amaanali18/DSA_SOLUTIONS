class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i : nums){
            if(i>max){
                max=i;
            }
        }
        int ans = 0;
        for(int i : nums){
            ans += Math.max(0,max-i);
        }
        return ans;
    }
}