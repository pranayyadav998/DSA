class Solution {
public class Pair implements Comparable<Pair>{
        int node;
        int time;// constructor
        Pair(int node, int time){
            this.node = node;
            this.time = time;
        }
        public int compareTo(Pair p){
            return this.time - p.time;
        }
    }
    public int networkDelayTime(int[][] times, int n, int src) {
        List<List<Pair>> adj = new ArrayList<>();// <=n 1-Based indexing
        for(int i=0;i<=n;i++) adj.add(new ArrayList<Pair>());// Populate
        for(int i=0;i<times.length;i++){
            int u = times[i][0], v = times[i][1], dist = times[i][2];
            adj.get(u).add(new Pair(v, dist));
        }// Dijkstra Algo.
        int[] ans = new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
            Pair top = pq.poll();
            int node = top.node, time = top.time;
            for(Pair p : adj.get(node)){
                int total_time = top.time + p.time;
                if(total_time < ans[p.node]){
                    ans[p.node] = total_time;
                    pq.add(new Pair(p.node, total_time));
                }
            }
        }
        int max = -1;
        for(int i=1;i<=n;i++){
            if(ans[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(ans[i], max);
        } 
        return max;
    }
}