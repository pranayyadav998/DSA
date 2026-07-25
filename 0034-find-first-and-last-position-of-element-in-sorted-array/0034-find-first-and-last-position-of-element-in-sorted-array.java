class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};

        int lo = 0;
        int hi = arr.length-1;
        boolean flag = false;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }else if(arr[mid] > target){
                hi = mid - 1;
            }else if(arr[mid] < target){
                lo = mid + 1;
            }
        }
        if(flag == false) return ans;

        lo = 0;
        hi = arr.length-1;
        int lb = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] >= target){
                lb = Math.min(lb,mid);
                hi = mid-1;
            }else{
                lo = mid + 1;
            }
        }
        ans[0] = lb;

        lo = 0;
        hi = arr.length-1;
        int ub = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > target){
                ub = Math.min(ub,mid);
                hi = mid-1;
            }else{
                lo = mid + 1;
            }
        }
        ans[1] = ub - 1;

        return ans;
    }
}