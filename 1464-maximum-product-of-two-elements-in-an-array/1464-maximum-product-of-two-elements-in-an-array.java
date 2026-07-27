class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {
            max1 = Math.max(max1, num);
        }

        int n = nums.length;
        int index = -1;
        int target = max1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }

            for (int i = 0; i < n - 1; i++) {
                max2 = Math.max(max2, nums[i]);
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}