class Solution {
    public int countValidPrefixes(String s) {
        int count = 0 , one = 0 , zer = 0;
        for(char c : s.toCharArray()){
            if(c=='0'){
                zer++;
            }else{
                one++;
            }
            if(Math.abs(one-zer)<=1) count++;
        }
        return count;
    }
}