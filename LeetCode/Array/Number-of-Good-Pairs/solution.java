class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x , map.getOrDefault(x,0) + 1);
        }
        int count = 0;
        for(Integer entry : map.values()){
            count += ((entry)*(entry-1))/2;
        }
        return count;
    }
}