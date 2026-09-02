class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int x : nums) if (((int)(Math.log10(x)+1) & 1) == 0) ans++;
        return ans;
    }
}