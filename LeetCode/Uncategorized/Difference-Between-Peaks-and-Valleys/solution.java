class Solution {
    public int peakValleyDifference(int[] nums) {
        int a = 0 , b = 0 , n=nums.length;
        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) a+=nums[i];
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]) b+=nums[i];
        }
        return a-b;
    }
}