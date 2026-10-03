class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);       
        int count = 0;          

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(i);      
            } else {             
                if (!st.isEmpty()) st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    count = Math.max(count, i - st.peek());
                }
            }
        }
        return count;
    }
}
