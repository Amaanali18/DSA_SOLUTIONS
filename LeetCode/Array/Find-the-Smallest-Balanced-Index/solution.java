class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long sum = 0;
        long product = 1;
        for (int x : nums) {
            sum += x;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            sum -= nums[i];
            if (sum == product) {
                return i;
            }
            if (nums[i] != 0 && product > sum / nums[i]) {
                break;
            }
            product *= nums[i];
        }
        return -1;
    }
}