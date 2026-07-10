import java.util.*;

class Solution {
    private boolean undirected = true;
    public ArrayList<ArrayList<Integer>> adj;

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            adj.add(list);
        }

        // Add edges
        for(int[] edge : edges){
            addEdge(edge[0], edge[1]);
        }

        return bfsCore(source, destination);
    }

    public void addEdge(int u, int v){
        adj.get(u).add(v);

        if(undirected){
            adj.get(v).add(u);
        }
    }

    private void bfs(int source, boolean[] visited){

        visited[source] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        while(!q.isEmpty()){

            int top = q.poll();

            List<Integer> neighbours = adj.get(top);

            for(int neighbour : neighbours){

                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    public boolean bfsCore(int source, int destination){

        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);

        bfs(source, visited);

        return visited[destination];
    }
}