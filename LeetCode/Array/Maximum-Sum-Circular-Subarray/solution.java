class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = nums[0] , gmax = nums[0] , gmin = nums[0] , cmax = nums[0] , cmin = nums[0];
        for(int i=1;i<nums.length;i++){
            sum += nums[i];
            cmax = Math.max(cmax+nums[i] , nums[i]);
            gmax = Math.max(gmax , cmax);
            cmin = Math.min(cmin+nums[i] , nums[i]);
            gmin = Math.min(gmin , cmin);
        }
        if(gmax < 0) return gmax;
        return Math.max(gmax,sum-gmin);
    }
}