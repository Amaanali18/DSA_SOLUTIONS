class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int a = Integer.MAX_VALUE, c = 0;
        for (int x : divisors) {
            int d = 0;
            for (int y : nums) {
                if (y % x == 0)
                    d++;
            }
            if (d > c || (d == c && x < a)) {
                a = x;
                c = d;
            }
        }
        return a;
    }
}