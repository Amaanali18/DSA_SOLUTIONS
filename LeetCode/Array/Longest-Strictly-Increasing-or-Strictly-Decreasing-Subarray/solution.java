class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        for(int i=0;i<nums.length-1;i++){
            boolean inc = true , dec = true;
            for(int j=i+1;j<nums.length;j++){
                if(inc && nums[j]<=nums[j-1]) inc=false;
                if(dec && nums[j]>=nums[j-1]) dec=false;
                if(inc || dec){
                    max = Math.max(max , j-i+1);
                }
            }
        }
        return max;
    }
}