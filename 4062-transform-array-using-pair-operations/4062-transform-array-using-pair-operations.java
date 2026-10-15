class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sumsource = 0;
        long sumtarget = 0;

        for(int i=0;i<source.length;i++){
            sumsource += source[i];
            sumtarget += target[i];
        }
        return sumsource == sumtarget;
    }
}