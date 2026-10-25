class Solution {
    public long maximizeSum(int[] nums, int k) {
        long ans = 0;
        int n = nums.length;
        int[] gain = new int[n];
        for(int i=0;i<n;i++){
            int curr = nums[i];
            int[] freq = new int[10];
            while(curr > 0){
                freq[curr % 10]++;
                curr/=10;
            }
            int max = 0;
            for(int j=9;j>=0;j--){
                while(freq[j]-- > 0){
                    max = (max*10)+j;
                }
            }
            ans += nums[i];
            gain[i] = (max - nums[i]);
        }
        Arrays.sort(gain);
        for(int i=n-1;i>=n-k;i--){
            ans += gain[i];
        }
        return ans;
    }
}