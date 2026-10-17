class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0 , sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int x : nums){
            sum += x;
            ans += map.getOrDefault(sum-goal,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}