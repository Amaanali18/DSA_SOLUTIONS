class Solution {
    public boolean checkString(String s) {
        int a = -1 , n = s.length() , b = n;
        for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);
            if(c=='a' && a==-1){
                a = i;
            }else if(c=='b'){
                b = i;
            }
        }
        return a<b;
    }
}