class Solution {
    class Pair{
        int node;
        int dist;
        int stop;
        Pair(int node, int dist, int stop){
            this.node = node;
            this.dist = dist;
            this.stop = stop;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<flights.length;i++){
            int u = flights[i][0];
            int v = flights[i][1];
            int c = flights[i][2];

            adj.get(u).add(new Pair(v,c,0));
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(src, 0 , 0));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int node_u = curr.node;
            int cost_u = curr.dist;
            int stop = curr.stop;

            if(stop> k) continue;

            for(Pair adjNode : adj.get(node_u)){
                int node_v = adjNode.node;
                int cost_v = adjNode.dist;

                if(dist[node_v] > cost_v + cost_u){
                    dist[node_v] = cost_v + cost_u;
                    q.offer(new Pair(node_v, dist[node_v], stop +1));
                }
            }

        }

        return dist[dst] != Integer.MAX_VALUE ? dist[dst] : -1;
    }
}