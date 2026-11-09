class Solution {
    public int countSegments(String s) {

        if (s.trim().isEmpty()) {
            return 0;
        }

        String[] words = s.trim().split("\\s+");

        return words.length;
    }
}