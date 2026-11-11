class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long buySolo = (long)cost1*need1 + (long)cost2*need2;
        long buyAll = (long)costBoth*Math.max(need1,need2);
        int overlap = Math.min(need1,need2);
        long buyMix = (long)costBoth*overlap + (long)(need1-overlap)*cost1 + (long)(need2-overlap)*cost2;
        long ans = Math.min(buyMix,Math.min(buySolo,buyAll));
        return ans;
    }
}