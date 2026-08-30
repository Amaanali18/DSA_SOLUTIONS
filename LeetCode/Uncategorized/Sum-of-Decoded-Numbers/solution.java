class Solution {
    public int MOD = 1_000_000_007;
    public int sumDecoded(long[] nums) {
        long ans = 0;
        for (long x : nums) {
            long d = x / 10 , w = x % 10;
            long digits = (long) Math.log10(d) + 1;
            long a = d / (long) Math.pow(10, digits - w);
            long b = d % (long) Math.pow(10, digits - w);
            ans = (ans + modPow(a,b))%MOD;
        }
        return (int)ans;
    }
    public long modPow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}