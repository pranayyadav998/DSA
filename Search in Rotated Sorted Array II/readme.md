# Search in Rotated Sorted Array II 🎯

## Problem Description

Given a rotated sorted array that may contain duplicates, implement a function to determine if a target value exists in the array.

## Problem Statement

There is an integer array `nums` sorted in non-decreasing order (not necessarily with distinct values). The array is rotated at an unknown pivot index `k` (0 <= k < nums.length).

For example: `[0,1,2,4,4,4,5,6,6,7]` might be rotated at pivot index 5 and become `[4,5,6,6,7,0,1,2,4,4]`.

Return `true` if target is in `nums`, or `false` if it is not.

## Examples

### Example 1:
```
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Explanation: Target 0 exists in the array
```

### Example 2:
```
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
Explanation: Target 3 does not exist in the array
```

## Constraints
- `1 <= nums.length <= 5000`
- `-10^4 <= nums[i] <= 10^4`
- `nums` is guaranteed to be rotated at some pivot
- `-10^4 <= target <= 10^4`

## Approach
1. Use modified binary search to handle duplicates
2. Compare middle element with target
3. Handle special cases with duplicates at ends

## Time Complexity
- Best Case: O(log n)
- Worst Case: O(n) due to duplicates

## Space Complexity
- O(1) - constant extra space

## Follow up
- Can you solve it without using extra space?
- How do you handle duplicate elements efficiently?

## Related Problems
- [33. Search in Rotated Sorted Array](../Search%20in%20Rotated%20Sorted%20Array)
- [153. Find Minimum in Rotated Sorted Array](../Find%20Minimum%20in%20Rotated%20Sorted%20Array)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)