class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length , pre = nums[0] , i = 1;
        for(;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                pre += nums[i];
            }else{
                break;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int j=0;j<n;j++){
            set.add(nums[j]);
        }
        while(set.contains(pre)){
            pre++;
        }
        return pre;
    }
}