class Solution {
    public boolean checkDivisibility(int n) {
        int ori = n;
        int sum = 0;
        int pro = 1;

        while(n!=0){
            int i= n % 10;
            sum += i;
            pro *= i;
            n = n / 10;
        }
        int ans = sum + pro;
        return ori % ans == 0;
    }
}