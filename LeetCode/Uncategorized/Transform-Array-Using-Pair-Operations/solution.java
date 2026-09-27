class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long s1 = 0 , s2 = 0;
        for(int x : source) s1 += x;
        for(int y : target) s2 += y;
        return s1 == s2;
    }
}