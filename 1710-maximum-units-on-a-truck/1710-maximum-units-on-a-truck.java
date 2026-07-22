class Solution {
    public int maximumUnits(int[][] boxtype, int truckSize) {
        Arrays.sort(boxtype,(a1,a2)-> a2[1]-a1[1]);
        int sum = 0;
        for(int i=0;i<boxtype.length;i++){
            int NBox = boxtype[i][0];
            int UBox = boxtype[i][1];

            int min = Math.min(truckSize, NBox);
            truckSize -= min;
            sum += min*UBox;
            if(truckSize == 0) return sum;
        }
        return sum;
    }
}