class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> st = new Stack<>();
        st.add(0);
        HashSet<Integer> seen = new HashSet<>();
        seen.add(0);
        while(!st.isEmpty()){
            int i = st.pop();
            for(int j : rooms.get(i)){
                if(!seen.contains(j)){
                    st.add(j);
                    seen.add(j);
                }
            }
        }
        return rooms.size() == seen.size();
    }
}