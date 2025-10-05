# Remove Element 🔄

## Problem Description
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. Return the number of elements that remain.

## Requirements
1. Modify array `nums` such that first `k` elements contain non-`val` elements
2. Return `k` (count of remaining elements)
3. Order of elements can be changed
4. Elements beyond index `k` can be ignored

## Examples

### Example 1
```
Input: nums = [3,2,2,3], val = 3
Output: 2
nums = [2,2,_,_]
Explanation: First two elements are 2, remaining elements don't matter
```

### Example 2
```
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5
nums = [0,1,4,0,3,_,_,_]
Explanation: First five elements can be in any order
```

## Constraints
- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

## Judge Implementation
```java
int[] nums = [...];          // Input array
int val = ...;               // Value to remove
int k = removeElement(nums, val);

// Verification
assert k == expectedNums.length;
sort(nums, 0, k);
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

## Solution Approach
1. Use two-pointer technique
2. Keep track of valid elements position
3. Overwrite elements in-place
4. No extra space needed

## Complexity
- Time: O(n)
- Space: O(1)

## Related Topics
- Arrays
- Two Pointers
- In-place Algorithm