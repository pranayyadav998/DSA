class Solution {
    public class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int dist;
        Triplet(int row, int col, int dist){
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
        public int compareTo(Triplet t){
            return this.dist - t.dist;
        }
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = Integer.MAX_VALUE;
            }
        }
        int num = grid[0][0];
        ans[0][0] = num;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,0,num));
        int[] r = {1,0};
        int[] c = {0,1};
        while(!pq.isEmpty()){
            Triplet top = pq.poll();
            int row = top.row, col = top.col, dist = top.dist;
            for(int i=0;i<2;i++){
                int newRow = row + r[i];
                int newCol = col + c[i];
                if(newRow<0 || newCol<0 || newRow>n-1 || newCol>m-1) continue;
                int d = dist + grid[newRow][newCol];
                if(d < ans[newRow][newCol]){
                    ans[newRow][newCol] = d;
                    pq.add(new Triplet(newRow, newCol, d));
                }
            }
        }
        return ans[n-1][m-1];
    }
}