# Linked List Cycle II

## 🎯 Problem Statement

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return `null`.

A cycle exists in a linked list if a node can be reached again by continuously following the `next` pointer. Internally, `pos` denotes the index of the node that the tail's `next` pointer connects to (0-indexed). It is `-1` if there is no cycle.

> **Note:** `pos` is not passed as a parameter.

**Important:** Do not modify the linked list.

## 📝 Examples

### Example 1:

![Linked List Cycle Example 1](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png)

```
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```

### Example 2:

![Linked List Cycle Example 2](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png)

```
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```

### Example 3:

![Linked List Cycle Example 3](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png)

```
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
```

## 🔒 Constraints

- The number of nodes in the list is in the range `[0, 10⁴]`
- `-10⁵ <= Node.val <= 10⁵`

## 💡 Solution Approach

### Floyd's Tortoise and Hare Algorithm

1. Use two pointers: `slow` (tortoise) and `fast` (hare)
2. Move `slow` one step at a time and `fast` two steps at a time
3. If there's a cycle, they will meet at some point
4. Reset `slow` to head and move both pointers at same speed
5. The point where they meet again is the start of the cycle

### Time & Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## 🧩 Implementation

Check the solution in [`Solution.java`](./Solution.java)

## 💫 Follow-up

Can you solve it without using extra space?
- Yes! The Floyd's algorithm used in the solution achieves this with O(1) space complexity.

---
*Happy Coding! 🚀*