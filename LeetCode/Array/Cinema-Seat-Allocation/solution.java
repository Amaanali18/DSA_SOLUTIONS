class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
        int s = rs.length;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < s; i++) {
            if (!map.containsKey(rs[i][0])) {
                map.put(rs[i][0], new HashSet<>());
            }
            map.get(rs[i][0]).add(rs[i][1]);
        }
        int count = 2 * n - 2 * map.size();
        for (Integer i : map.keySet()) {
            boolean flag = false;
            Set<Integer> r = map.get(i);
            if (!r.contains(2) && !r.contains(3) && !r.contains(4) && !r.contains(5)) {
                count++;
                flag = true;
            }
            if (!r.contains(6) && !r.contains(7) && !r.contains(8) && !r.contains(9)) {
                count++;
                flag = true;
            }
            if (!flag && !r.contains(4) && !r.contains(5) && !r.contains(6) && !r.contains(7)) {
                count++;
            }
        }
        return count;
    }
}