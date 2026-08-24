class Solution {
    public int dominantIndices(int[] nums) {
        int sum = 0 , count = 0 , n = nums.length;
        for(int x : nums){
            sum += x;
        }
        for(int i=0;i<n;i++){
            sum -= nums[i];
            if(nums[i]*(n-i-1) > sum) count++;
        }
        return count;
    }
}