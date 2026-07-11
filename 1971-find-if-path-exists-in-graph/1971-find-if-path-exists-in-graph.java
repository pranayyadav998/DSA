class Solution {

    private boolean undirected;
    private ArrayList<ArrayList<Integer>> adj;

    public void initialize(int n, boolean undirected) {
        this.undirected = undirected;
        adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);

        if (undirected) {
            adj.get(v).add(u);
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        initialize(n, true);

        for (int[] edge : edges) {
            addEdge(edge[0], edge[1]);
        }

        return bfs(source, destination);
    }

    private boolean bfsCore(int source, boolean[] visited, int destination) {

        Queue<Integer> q = new LinkedList<>();

        visited[source] = true;
        q.add(source);

        while (!q.isEmpty()) {

            int top = q.poll();

            // Destination found
            if (top == destination) {
                return true;
            }

            List<Integer> neighbours = adj.get(top);

            for (int neighbour : neighbours) {

                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return false;
    }

    private boolean bfs(int source, int destination) {

        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);

        return bfsCore(source, visited, destination);
    }
}