class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = 0 , min = n-1;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[max]) max = i;
            if(nums[i] < nums[min]) min = i;
        }
        return Math.min(Math.min(Math.max(min,max)+1,n-Math.min(min,max)),
        Math.min(min+1+n-max,max+1+n-min));
    }
}