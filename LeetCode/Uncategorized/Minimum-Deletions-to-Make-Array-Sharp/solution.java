class Solution {
    public int minDeletions(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        int ans = 0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]) ans++;
        }
        return ans;
    }
}