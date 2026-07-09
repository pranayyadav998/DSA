class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n+1];

        for(int num : nums){
            visited[num] = true;
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}