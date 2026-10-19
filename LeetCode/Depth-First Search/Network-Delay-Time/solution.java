class Solution {
    public int networkDelayTime(int[][] edges, int V, int src) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++)
            adj.add(new ArrayList<>());
        for (int[] row : edges) {
            int u = row[0], v = row[1], d = row[2];
            adj.get(u).add(new int[] { v, d });
        }
        int[] dist = new int[V + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new int[] { 0, src });
        while (!pq.isEmpty()) {
            int[] x = pq.poll();
            int d = x[0], n = x[1];
            if (d > dist[n])
                continue;
            for (int[] y : adj.get(n)) {
                int a = y[0], b = y[1];
                int curr = b + d;
                if (curr < dist[a]) {
                    dist[a] = curr;
                    pq.add(new int[] { curr, a });
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}