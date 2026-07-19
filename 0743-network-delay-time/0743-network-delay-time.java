class Solution {

    class Pair implements Comparable<Pair> {
        int node;
        int time;

        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }

        @Override
        public int compareTo(Pair p) {
            return this.time - p.time;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj.get(u).add(new Pair(v, wt));
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        dist[k] = 0;
        pq.offer(new Pair(k, 0));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();

            int node = curr.node;
            int currTime = curr.time;

            for (Pair adjNode : adj.get(node)) {

                int nextNode = adjNode.node;
                int edgeWeight = adjNode.time;

                if (currTime + edgeWeight < dist[nextNode]) {

                    dist[nextNode] = currTime + edgeWeight;
                    pq.offer(new Pair(nextNode, dist[nextNode]));
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            ans = Math.max(ans, dist[i]);
        }

        return ans;
    }
}