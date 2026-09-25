class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int i = 0 , j = nums.length-1;
        while(i<j){
            int num1 = nums[i];
            int num2 = nums[j];
            int digit = (int)Math.log10(num2)+1;
            long mul = 1;
            while(digit-->0){
                mul *= 10;
            }
            mul *= num1;
            mul += num2;
            ans += mul;
            i++;
            j--;
        }
        if(i==j) ans+=nums[i];
        return ans;
    }
}