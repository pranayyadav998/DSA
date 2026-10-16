class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] ch = s.toCharArray(), sh = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(sh);

        for(int i=0;i<ch.length;i++){
            if(ch[i] != sh[i]) return false;
        }
        return true;
    }
}