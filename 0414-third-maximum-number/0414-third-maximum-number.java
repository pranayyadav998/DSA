class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        if (nums.length < 3) return nums[nums.length - 1];

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) j++;
            nums[j] = nums[i];
        }

        if (j + 1 < 3) {
            return nums[j];
        }

        return nums[j - 2];
    }
}