class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        List<int[]> map = new ArrayList<>();
        for(int i=0;i<n;i++) map.add(new int[]{nums[i],i});
        map.sort((a,b)->(a[0]-b[0]));
        int min = map.get(0)[1] , ans = 0;
        for(int i=1;i<n;i++){
            int curr = map.get(i)[1];
            ans = Math.max(ans,curr-min);
            min = Math.min(min,curr);
        }
        return ans;
    }
}