class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        l.add(nums[0]);
        r.add(nums[1]);
        for(int i=2;i<n;i++){
            if(l.get(l.size()-1) > r.get(r.size()-1)){
                l.add(nums[i]);
            }else{
                r.add(nums[i]);
            }
        }
        l.addAll(r);
        int[] ans = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            ans[i] = l.get(i);
        }
        return ans;
    }
}