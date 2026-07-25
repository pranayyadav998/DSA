class Solution {
    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;

        while(n > 0){
            int i = n % 10;
            if(i >= max1){
                max2 = max1;
                max1 = i;
            }else if(i > max2){
                max2 = i;
            }
            n = n / 10;
        }
        return max1 * max2;
    }
}