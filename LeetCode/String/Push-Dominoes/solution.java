class Solution {
    public String pushDominoes(String s) {
        // iterate one time from left and other from right
        int n = s.length();
        int[] rt = new int[n];
        int[] lt = new int[n];
        int r = 0;
        for(int i = 0 ; i < rt.length ; i++){
            if(s.charAt(i)=='R'){
                r = n;
            }else if(s.charAt(i)=='L'){
                r = 0;
            }else if(r>0){
                r--;
            }
            rt[i] = r;
        }
        int l = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            if(s.charAt(i)=='L'){
                l = n;
            }else if(s.charAt(i)=='R'){
                l = 0;
            }else if(l>0){
                l--;
            }
            lt[i] = l;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++){
            if(rt[i]>lt[i]){
                str.append('R');
            }else if(rt[i]<lt[i]){
                str.append('L');
            }else{
                str.append('.');
            }
        }
        return str.toString();
    }
}