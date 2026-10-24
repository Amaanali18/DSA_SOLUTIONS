class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<minK || nums[j]>maxK){
                i=j+1;
            }else{
                ans+=(j-i+1);
            }
        }
        return ans;
    }
}