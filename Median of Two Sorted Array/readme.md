# 4. Median of Two Sorted Arrays

## Problem Statement# Median of Two Sorted Arrays 📊

## Problem Description
Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the **median** of the two sorted arrays.

**Time Complexity Required:** O(log (m+n))

## Examples

### Example 1:
```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
```

### Example 2:
```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5
```

## Constraints
- `nums1.length == m`
- `nums2.length == n`
- `0 <= m <= 1000`
- `0 <= n <= 1000`
- `1 <= m + n <= 2000`
- `-10^6 <= nums1[i], nums2[i] <= 10^6`

## Solution Approach
1. Use binary search approach
2. Find the correct partition point in both arrays
3. Compare elements around partition points
4. Handle odd and even length cases

## Complexity Analysis
- **Time Complexity:** O(log (min(m,n)))
- **Space Complexity:** O(1)

## Implementation Details
- The solution uses binary search on the smaller array
- Ensures that left and right partitions are balanced
- Handles edge cases when one array is empty

## Related Topics
- Binary Search
- Array
- Divide and Conquer

## Follow-up Questions
1. Can you solve it without merging the arrays?
2. How would you handle invalid inputs?

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106