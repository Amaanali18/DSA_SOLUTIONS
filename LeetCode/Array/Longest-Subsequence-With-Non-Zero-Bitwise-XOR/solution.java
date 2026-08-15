class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int curr = nums[0] , zero = nums[0]==0?1:0;
        for(int i=1;i<n;i++){
            if(nums[i]==0) zero++;
            curr ^= nums[i];
        }
        if(zero == n){
            return 0;
        }else if(curr == 0){
            return n-1;
        }
        return n;
    }
}