class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length , ans = Integer.MAX_VALUE;
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                flag = false;
                ans &= i;
            }
        }
        if(flag) return 0;
        return ans;
    }
}