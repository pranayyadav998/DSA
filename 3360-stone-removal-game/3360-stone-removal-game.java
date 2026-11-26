class Solution {
    public boolean canAliceWin(int n) {
        int a = 10;
        int count = 0;
        while(n >= a){
            n -= a;
            a--;
            count++;
        }
        return count % 2 == 1;
    }
}