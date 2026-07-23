class Solution {
    public int[][] merge(int[][] intervals) {
        // -- > key info is when currS <= preE then they will overlap
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a1, int[] a2){
                return a1[0] - a2[0];
            }
        });
        List<int[]> ans = new ArrayList<>();

        for(int[] interval : intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < interval[0]){
                ans.add(interval);
            }else{
                int[] merg = new int[2];
                merg[0] = ans.get(ans.size()-1)[0];
                merg[1] = Math.max(interval[1], ans.get(ans.size()-1)[1]);
                ans.set(ans.size()-1, merg);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }   
}