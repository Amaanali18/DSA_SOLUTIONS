class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sort = true;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) > s.charAt(i+1)){
                sort = false;
                break;
            }
        }
        if(sort) return 0;
        if(n<=2) return -1;
        char min = 'z' , max = 'a';
        for(char c : s.toCharArray()){
            if(c<min) min=c;
            if(c>max) max=c;
        }
        if (s.charAt(0) == min || s.charAt(n - 1) == max) return 1;
        for (int i = 1; i < n - 1; ++i) {
            char c = s.charAt(i);
            if (c == min || c == max) return 2;
        }
        return 3;
    }
}