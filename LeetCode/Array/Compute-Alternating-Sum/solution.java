class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i+=2){
            if(i<nums.length) sum+=nums[i];
            if(i+1<nums.length) sum-=nums[i+1];
        }
        return sum;
    }
}