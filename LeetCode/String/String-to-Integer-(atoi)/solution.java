class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        int sign = 1 , idx = 0;
        if(s.charAt(idx) == '+'){
            idx++;
        }else if(s.charAt(idx) == '-'){
            sign = -1;
            idx++;
        }
        long res = 0;
        while(idx < s.length() && Character.isDigit(s.charAt(idx))){
            res = res*10 + (s.charAt(idx) - '0');
            if(sign*res <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign*res >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            idx++;
        }
        return (int)(res*sign);
    }
}