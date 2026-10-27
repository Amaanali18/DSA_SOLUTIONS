class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        generate(ans,nums,new ArrayList<>(),0);
        return new ArrayList<>(ans);
    }
    public void generate(Set<List<Integer>> ans,int[] nums,List<Integer> curr , int idx){
        ans.add(new ArrayList<>(curr));
        for(int i=idx;i<nums.length;i++){
            // if(i>0 && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            generate(ans,nums,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}