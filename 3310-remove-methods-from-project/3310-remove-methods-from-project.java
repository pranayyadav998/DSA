import java.util.*;

public class Solution {
    ArrayList<ArrayList<Integer>> adj;

    private void dfs(int source, boolean[] visited) {
        if (!visited[source]) {
            visited[source] = true;

            List<Integer> neighbours = adj.get(source);

            for (int neighbour : neighbours) {
                if (!visited[neighbour]) {
                    dfs(neighbour, visited);
                }
            }
        }
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        // Step 1: Create adjacency list
        adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }

        // Step 2: Find all suspicious methods
        boolean[] visited = new boolean[n];

        dfs(k, visited);

        // Step 3: Check whether a non-suspicious method
        // invokes a suspicious method
        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];

            if (!visited[u] && visited[v]) {

                // Cannot remove suspicious methods
                List<Integer> ans = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }

                return ans;
            }
        }

        // Step 4: Keep only non-suspicious methods
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}