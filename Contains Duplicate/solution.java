class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(st.contains(curr)) return true;
            st.add(curr);
        }
        return false;
        
    }
}