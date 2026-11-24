class Solution {
    public int maxLength(int[] nums) {
        int max = 0 , n = nums.length;
        for(int i=0;i<n;i++){
            long prod = 1 , lcm = 1 , gcd = 0;
            for(int j=i;j<n;j++){
                prod *= nums[j];
                gcd = solvegcd(gcd,nums[j]);
                lcm = (lcm / solvegcd(lcm, nums[j])) * nums[j];
                if(prod == (gcd*lcm)){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public long solvegcd(long a,long b){
        if(b==0) return a;
        return solvegcd(b,a%b);
    }
}