class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> r = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        for(int x : arr2){
            m.put(x,0);
        }
        for(int x : arr1){
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }else{
                r.add(x);
            }
        }
        for(int x : arr2){
            for(int y=0;y<m.get(x);y++){
                a.add(x);
            }
        }
        Collections.sort(r);
        a.addAll(r);
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}