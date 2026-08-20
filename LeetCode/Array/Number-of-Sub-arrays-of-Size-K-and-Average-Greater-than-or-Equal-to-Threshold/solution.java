class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        long sum = 0;
        int i = 0 , c = 0 , n = arr.length;
        for(;i<k;i++){
            sum += arr[i];
        }
        if(sum >= t*k) c++;
        for(i=k;i<n;i++){
            sum -= arr[i-k];
            sum += arr[i];
            if(sum >= t*k) c++;
        }
        return c;
    }
}