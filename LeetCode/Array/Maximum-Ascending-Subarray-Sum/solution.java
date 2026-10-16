class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0] , max = sum , n=nums.length;
        if(n==1) return max;
        for(int r=1;r<nums.length;r++){
            if(nums[r]<=nums[r-1]){
                sum = nums[r];
            }else{
                sum += nums[r];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}