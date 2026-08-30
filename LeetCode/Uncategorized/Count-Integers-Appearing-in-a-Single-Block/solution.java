class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] freq = new int[100];
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]) freq[nums[i]-1]++;
        }
        int ans = 0;
        for(int x : freq){
            if(x == 1) ans++;
        }
        return ans;
    }
}