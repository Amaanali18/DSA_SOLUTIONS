class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : piles){
            pq.add(x);
        }
        while(k-- > 0){
            int x = pq.poll();
            if((x&1)==1) x+=1;
            x/=2;
            pq.add(x);
        }
        int sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}