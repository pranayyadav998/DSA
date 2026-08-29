class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] word = s.split("\\s+");
        String ans = "";

        for(int i=word.length-1;i>=0;i--){
            ans += word[i] + " ";
        }
        return ans.trim();
    }
}