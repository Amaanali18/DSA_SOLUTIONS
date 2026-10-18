class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return (countless(nums,k)-countless(nums,k-1));
    }
    public int countless(int[] nums,int k){
        if(k<0) return 0;
        int l=0,r=0,sum=0,ans=0;
        while(r<nums.length){
            sum += (nums[r]%2==1?1:0);
            while(sum > k){
                sum -= (nums[l]%2==1?1:0);
                l++;
            }
            ans += r-l+1;
            r++;
        }
        return ans;
    }
}