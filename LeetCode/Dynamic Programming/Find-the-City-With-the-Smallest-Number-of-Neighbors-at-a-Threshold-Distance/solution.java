
class Solution {
    public int findTheCity(int n, int[][] edges, int t) {
        int[][] adj = new int[n][n];

        for (int[] row : adj)
            Arrays.fill(row, Integer.MAX_VALUE / 2);

        for (int i = 0; i < n; i++)
            adj[i][i] = 0;

        for (int[] row : edges) {
            int i = row[0], j = row[1], w = row[2];
            adj[i][j] = w;
            adj[j][i] = w;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    adj[j][k] = Math.min(
                        adj[j][k],
                        adj[j][i] + adj[i][k]
                    );
                }
            }
        }

        int min = n, city = -1;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && adj[i][j] <= t)
                    cnt++;
            }

            if (cnt <= min) {
                min = cnt;
                city = i;
            }
        }

        return city;
    }
}
