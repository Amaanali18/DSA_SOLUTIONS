class Solution {
    public long[] sumOfThree(long num) {
        boolean valid = num%3==0;
        if(!valid) return new long[]{};
        long x = num/3;
        return new long[]{x-1,x,x+1};
    }
}