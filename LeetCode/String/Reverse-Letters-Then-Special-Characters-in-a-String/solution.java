class Solution {
    public String reverseByType(String s) {
        StringBuilder str = new StringBuilder(s);
        Set<Character> set = Set.of('!','@','#','$','%','^','&','*','(',')');
        int n = s.length();
        int i = 0 , j = n-1;
        while(i<j){
            if(set.contains(s.charAt(i))){
                i++;
            }else if(set.contains(s.charAt(j))){
                j--;
            }else{
                char c = s.charAt(i);
                str.setCharAt(i,s.charAt(j));
                str.setCharAt(j,c);
                i++;
                j--;
            }
        }
        i = 0;
        j = n-1;
        while(i<j){
            if(!set.contains(s.charAt(i))){
                i++;
            }else if(!set.contains(s.charAt(j))){
                j--;
            }else{
                char c = s.charAt(i);
                str.setCharAt(i,s.charAt(j));
                str.setCharAt(j,c);
                i++;
                j--;
            }
        }
        return str.toString();
    }
}