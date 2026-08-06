class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int pro = 1;
            int num = n;
            while(num > 0){
                int di= num % 10;
                pro *= di ;
                num = num / 10;
            }
            if(pro % t == 0) return n;
            n++;
        }
    }
}