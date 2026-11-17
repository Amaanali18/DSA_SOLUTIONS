class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int l = i<1?Integer.MIN_VALUE:nums[i-1];
            int r = i+1==n?Integer.MIN_VALUE:nums[i+1];
            if(l<nums[i] && nums[i]>r){
                return i;
            }
        }
        return 0;
    }
}