class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return (countless(nums,k) - countless(nums,k-1));
    }
    public int countless(int[] nums,int k){
        if(k<0) return 0;
        int l=0,r=0,ans=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size() > k){
                if(map.get(nums[l])==1){
                    map.remove(nums[l]);
                }else{
                    map.put(nums[l],map.get(nums[l])-1);
                }
                l++;
            }
            ans += r-l+1;
            r++;
        }
        return ans;
    }
}