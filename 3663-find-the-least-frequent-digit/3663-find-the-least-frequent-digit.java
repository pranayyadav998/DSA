class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n>0){
            int digit = n % 10;
            if(map.containsKey(digit)){
                map.put(digit, map.get(digit) + 1);
            }
            else{
                map.put(digit,1);
            }
            n = n / 10;
        }
int min = Integer.MAX_VALUE;
int ans = -1;

for(int key : map.keySet()) {
    int freq = map.get(key);

    if(freq < min) {
        min = freq;
        ans = key;
    }
    else if(freq == min && key < ans) {
        ans = key;
    }
}
return ans;
    }
}