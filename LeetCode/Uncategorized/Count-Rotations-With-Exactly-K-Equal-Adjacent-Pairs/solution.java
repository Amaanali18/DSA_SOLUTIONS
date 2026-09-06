class Solution {
    public int countRotations(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        int count = 0 , n = s.length();
        for(int i=0;i<n;i++){
            int score = 0;
            for(int j=0;j<n-1;j++){
                if(str.charAt(j)==str.charAt(j+1)) score++;
            }
            if(score == k) count++;
            char c = str.charAt(0);
            str.deleteCharAt(0);
            str.append(c);
        }
        return count;
    }
}