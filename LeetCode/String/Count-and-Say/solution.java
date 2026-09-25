class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = "1";
        for(int i=2;i<=n;i++){
            s = rle(s);
        }
        return s;
    }
    public String rle(String s){
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<n){
            int count = 1;
            while(i+1<n && s.charAt(i)==s.charAt(i+1)){
                i++;
                count++;
            }
            str.append(count);
            str.append(s.charAt(i));
            i++;
        }
        return str.toString();
    }
}