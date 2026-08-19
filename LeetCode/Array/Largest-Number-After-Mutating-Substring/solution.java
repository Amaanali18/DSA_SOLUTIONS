class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder str = new StringBuilder(num);
        boolean go = false;
        for(int i=0;i<num.length();i++){
            int c = num.charAt(i) - '0';
            if(!go && change[c] > c){
                str.setCharAt(i,(char)('0'+change[c]));
                go=!go;
            }else if(go && change[c]>=c){
                str.setCharAt(i,(char)('0'+change[c]));
            }else if(go && change[c] < c){
                break;
            }
        }
        return str.toString();
    }
}