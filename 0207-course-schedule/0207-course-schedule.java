class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int totalpairs = prerequisites.length;

        ArrayList<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        int[] InDeg = new int[numCourses];

        for(int i=0;i<totalpairs;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            InDeg[prerequisites[i][0]]++;
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(InDeg[i] == 0){
                q.add(i);
            }
        }
        int count = 0;

        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            count++;

              for(int j = 0; j < adj.get(node).size(); j++)
            {
                int neighbour = adj.get(node).get(j);

                InDeg[neighbour]--;

                if(InDeg[neighbour] == 0)
                {
                    q.add(neighbour);
                }
            }
        }
        return count==numCourses;
    }
}