class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        if(arr.length<=1) return arr[0];
        int l = 0 , h = arr.length-1;
        while(l<h){
            String temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        return String.join(" ",arr);
    }
}