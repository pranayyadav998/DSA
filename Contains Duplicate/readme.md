# 217 Conatin Duplicate

## Problem Description
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Examples

### Example 1
```java
Input: nums = [1,2,3,1]
Output: true
Explanation: The element 1 occurs at indices 0 and 3
```

### Example 2
```java
Input: nums = [1,2,3,4]
Output: false
Explanation: All elements are distinct
```

### Example 3
```java
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
Explanation: Multiple elements appear more than once
```

## Constraints
- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

## Solution Approaches

### 1. HashSet Approach
```java
// Time: O(n), Space: O(n)
Set<Integer> set = new HashSet<>();
for(int num : nums) {
    if(!set.add(num)) return true;
}
return false;
```

### 2. Sorting Approach
```java
// Time: O(n log n), Space: O(1)
Arrays.sort(nums);
for(int i = 1; i < nums.length; i++) {
    if(nums[i] == nums[i-1]) return true;
}
return false;
```

## Complexity Analysis
| Approach | Time | Space |
|----------|------|-------|
| HashSet | O(n) | O(n) |
| Sorting | O(n log n) | O(1) |

## Related Topics
- Array
- Hash Table
- Sorting

---
*LeetCode Problem #217 - Easy*