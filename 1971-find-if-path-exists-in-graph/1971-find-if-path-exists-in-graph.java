class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Creating empty lists for every node
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        // Converting edges array into graph
        for(int i = 0; i < edges.length; i++){

            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        
        boolean[] visited = new boolean[n];
        visited[source] = true;

        int node;
        
        while(!q.isEmpty()){
            node = q.peek();
            q.remove();

            if(node == destination){
                return true;  
            }
            
            for(int j=0;j<adj.get(node).size();j++){
                
                int neighbour = adj.get(node).get(j);

                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return false;
    }
}