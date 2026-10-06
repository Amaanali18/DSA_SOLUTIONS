class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length()==0) return 0;
        int op = 0,cp = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                op++;
            }else if(c==')' && op>0){
                op--;
            }else{
                cp++;
            }
        }
        return op+cp;
    }
}