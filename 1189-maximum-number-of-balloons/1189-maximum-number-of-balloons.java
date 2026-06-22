class Solution {
    public int maxNumberOfBalloons(String text) {
        StringBuilder sb = new StringBuilder(text);
        int count = 0;

        while (true) {
            String word = "balloon";

            for (char ch : word.toCharArray()) {
                int idx = sb.indexOf(String.valueOf(ch));

                if (idx == -1) {
                    return count;
                }

                sb.deleteCharAt(idx);
            }

            count++;
        }
    }
}