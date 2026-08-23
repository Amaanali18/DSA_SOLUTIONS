class Solution {
    public boolean isPalindromic(String s) {
        int l = 0 , r = s.length()-1;
        while(l<=r){
            int left = s.charAt(l);
            int right = s.charAt(r);
            if(left != reverseBits(right)) return false;
            l++;
            r--;
        }
        return true;
    }
    public int reverseBits(int num){
        int rev = 0;
        for(int i=0;i<8;i++){
            rev = (rev<<1) | (num & 1);
            num >>= 1;
        }
        return rev;
    }
}