class Solution {

    public int findCircleNum(int[][] isConnected) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int count = 0;

        int n = isConnected.length;

        // Creating empty lists for every node
        for(int i = 0; i < n; i++){

            adj.add(new ArrayList<>());
        }

        // Converting adjacency matrix into adjacency list
        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                // If cities are connected and not same city
                if(isConnected[i][j] == 1 && i != j){

                    adj.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];

        // Checking every node
        for(int i = 0; i < n; i++){

            // Start BFS only if node not visited
            if(!visited[i]){

                Queue<Integer> q = new LinkedList<>();

                q.add(i);

                visited[i] = true;

                while(!q.isEmpty()){

                    int node = q.peek();

                    q.remove();

                    // Traverse neighbours
                    for(int j = 0; j < adj.get(node).size(); j++){

                        int neighbour = adj.get(node).get(j);

                        if(!visited[neighbour]){

                            visited[neighbour] = true;

                            q.add(neighbour);
                        }
                    }
                }

                // One complete BFS = one province
                count++;
            }
        }

        return count;
    }
}