class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k];
        arr[0]=1;
        int ans = 0 , sum = 0;
        for(int n : nums){
            sum = (sum+n)%k;
            if(sum < 0) sum+=k;
            ans += arr[sum];
            arr[sum]++;
        }
        return ans;
        
    }
}