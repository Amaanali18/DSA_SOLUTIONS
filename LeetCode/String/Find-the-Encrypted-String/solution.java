class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        int n = s.length();
        for(int i=0;i<n;i++){
            str.setCharAt(i,s.charAt((i+k)%n));
        }
        return str.toString();
    }
}