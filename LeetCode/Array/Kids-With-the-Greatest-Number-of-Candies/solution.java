class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int max = -1;
        List<Boolean> ans = new ArrayList<>();
        for(int x:candies) if(x>max) max=x;
        for(int x:candies) ans.add(x+e>=max?true:false);
        return ans;
    }
}