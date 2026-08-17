class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int l = 0 , h = k;
        while(l<s.length()){
            ans.append(dothejob(s,l,h));
            l += k;
            h += k;
        }
        return ans.toString();
    }
    public char dothejob(String s,int l,int h){
        if(h>=s.length()) h=s.length();
        int sum = 0;
        for(int i=l;i<h;i++){
            sum += (s.charAt(i) - 'a');
        }
        sum %= 26;
        return (char)(sum+'a');
    }
}