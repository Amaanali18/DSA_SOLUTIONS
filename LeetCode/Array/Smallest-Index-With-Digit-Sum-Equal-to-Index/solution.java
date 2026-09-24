class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean digit = nums[i]<10;
            if(digit){
                if(nums[i]==i) return i;
            }else{
                int sum = count(nums[i]);
                if(i==sum) return i;
            }
        }
        return -1;
    }
    public static int count(int x){
        int sum = 0;
        while(x!=0){
            sum+=(x%10);
            x/=10;
        }
        return sum;
    }
}