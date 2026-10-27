class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(ans,nums,new ArrayList<>(),0);
        return ans;
    }
    public void generate(List<List<Integer>> ans,int[] nums,List<Integer> curr , int idx){
        ans.add(new ArrayList<>(curr));
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            generate(ans,nums,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}