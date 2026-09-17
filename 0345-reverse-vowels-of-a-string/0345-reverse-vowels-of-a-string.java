class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = sb.length()-1;

        while(left<right){
            while(left < right && !checkVowel(sb.charAt(left))){
                left++;
            }
            while(left < right && !checkVowel(sb.charAt(right))){
                right--;
            }

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        return sb.toString();
    }
    public boolean checkVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}