class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                list.add(i);
            }
        }
        int n = queries.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = queries[i]>list.size()?-1:list.get(queries[i]-1);
        }
        return ans;
    }
}