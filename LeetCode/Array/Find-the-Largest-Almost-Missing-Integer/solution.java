class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = -1 , rmax = -1 , n = nums.length;
        for(int key : map.keySet()){
            if(key>rmax && map.get(key)==1){
                rmax=key;
            }
            if(key > max){
                max=key;
            }
        }
        if(k==1) return rmax;
        if(k==n) return max;
        int a = map.get(nums[0]) , b = map.get(nums[n-1]);
        if(a==1 && b==1) return Math.max(nums[0],nums[n-1]);
        else if(a==1) return nums[0];
        else if(b==1) return nums[n-1];
        return -1;
    }
}