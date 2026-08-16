# Linked List Components

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/linked-list-components/submissions/2108939968/](https://leetcode.com/problems/linked-list-components/submissions/2108939968/) |
| **Problem ID** | linked-list-components |
| **Language** | Java |
| **Runtime** | 8 ms |
| **Memory** | 47364000 MB |
| **Accepted At** | 2026-08-16T12:03:21.000Z |

## Tags

`Array`, `Hash Table`, `Linked List`

## Problem Statement

You are given the `head` of a linked list containing unique integer values and an integer array `nums` that is a subset of the linked list values.

Return the number of **connected** **components** in `nums`. A connected component is a non-empty, maximal sequence of **consecutive** nodes in the linked list such that every node&#39;s value belongs to nums.

&nbsp;

Example 1:**

```

**Input:** head = [0,1,2,3], nums = [0,1,3]
**Output:** 2
**Explanation:** 0 and 1 are connected, so [0, 1] and [3] are the two connected components.

```

Example 2:**

```

**Input:** head = [0,1,2,3,4], nums = [0,3,1,4]
**Output:** 2
**Explanation:** 0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.

```

&nbsp;

**Constraints:**

	- The number of nodes in the linked list is `n`.

	- `1 &lt;= n &lt;= 104`

	- `0 &lt;= Node.val &lt; n`

	- All the values `Node.val` are **unique**.

	- `1 &lt;= nums.length &lt;= n`

	- `0 &lt;= nums[i] &lt; n`

	- All the values of `nums` are **unique**.

## Constraints

- The number of nodes in the linked list is n.
- 1 &lt;= n &lt;= 104
- 0 &lt;= Node.val &lt; n

---
