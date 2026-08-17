class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m>n){
            return intersection(nums2,nums1);
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int x : nums1){
            set1.add(x);
        }
        List<Integer> l = new ArrayList<>();
        for(int y : nums2){
            if(set2.add(y) && set1.contains(y)){
                l.add(y);
            }
        }
        int[] ans = new int[l.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}