class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int [nums1.length + nums2.length];
        int index = 0;
        for(int i = 0; i<nums1.length;i++){
            merged[index++]=nums1[i];
        }
        for(int i = 0;i<nums2.length;i++){
            merged[index++]=nums2[i];
        }
        Arrays.sort(merged);
        int n=merged.length;
        double median = 0;

        if(n%2==1){
            median=merged[n/2];
        }else{
            median=(merged[n/2-1] + merged[n/2])/2.0;
        }
        return median;
    }
}