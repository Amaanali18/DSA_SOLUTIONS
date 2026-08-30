class Solution {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        StringBuilder str = new StringBuilder();
        int d = 1;
        for(int i=s.length()-1; i>=0 ; i--){
            if(d==4){
                str.insert(0,'.');
                d=1;
            }
            d++;
            str.insert(0,s.charAt(i));
        }
        return str.toString();
    }
}