# Linked List Cycle II

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/linked-list-cycle-ii/submissions/2101229094/?envType=problem-list-v2&envId=linked-list](https://leetcode.com/problems/linked-list-cycle-ii/submissions/2101229094/?envType=problem-list-v2&envId=linked-list) |
| **Problem ID** | linked-list-cycle-ii |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 46520000 MB |
| **Accepted At** | 2026-08-10T07:36:43.000Z |

## Tags

`Hash Table`, `Linked List`, `Two Pointers`, `Floyd's Cycle Finding Algorithm`

## Problem Statement

Given the `head` of a linked list, return *the node where the cycle begins. If there is no cycle, return *`null`.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail&#39;s `next` pointer is connected to (**0-indexed**). It is `-1` if there is no cycle. **Note that** `pos` **is not passed as a parameter**.

**Do not modify** the linked list.

&nbsp;

Example 1:**

```

**Input:** head = [3,2,0,-4], pos = 1
**Output:** tail connects to node index 1
**Explanation:** There is a cycle in the linked list, where tail connects to the second node.

```

Example 2:**

```

**Input:** head = [1,2], pos = 0
**Output:** tail connects to node index 0
**Explanation:** There is a cycle in the linked list, where tail connects to the first node.

```

Example 3:**

```

**Input:** head = [1], pos = -1
**Output:** no cycle
**Explanation:** There is no cycle in the linked list.

```

&nbsp;

**Constraints:**

	- The number of the nodes in the list is in the range `[0, 104]`.

	- `-105 &lt;= Node.val &lt;= 105`

	- `pos` is `-1` or a **valid index** in the linked-list.

&nbsp;

**Follow up:** Can you solve it using `O(1)` (i.e. constant) memory?

## Constraints

- The number of the nodes in the list is in the range [0, 104].
- -105 &lt;= Node.val &lt;= 105

---
