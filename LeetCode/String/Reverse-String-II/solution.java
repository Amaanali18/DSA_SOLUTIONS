class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int low = 0;
        int high = 2*k;
        while(low<s.length()){
            reverse(sb,low,Math.min(low+k-1,s.length()-1));
            low += 2*k;
            high += 2*k;
        }
        return sb.toString();
    }
    public void reverse(StringBuilder sb,int l,int h){
        while(l<h){
            char c = sb.charAt(l);
            sb.setCharAt(l,sb.charAt(h));
            sb.setCharAt(h,c);
            l++;
            h--;
        }
    }
}