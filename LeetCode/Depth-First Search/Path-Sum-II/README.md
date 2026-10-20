# Path Sum II

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/path-sum-ii/submissions/2176951391/](https://leetcode.com/problems/path-sum-ii/submissions/2176951391/) |
| **Problem ID** | path-sum-ii |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 44988000 MB |
| **Accepted At** | 2026-10-20T09:59:02.000Z |

## Tags

`Backtracking`, `Tree`, `Depth-First Search`, `Binary Tree`

## Problem Statement

Given the `root` of a binary tree and an integer `targetSum`, return *all **root-to-leaf** paths where the sum of the node values in the path equals *`targetSum`*. Each path should be returned as a list of the node **values**, not node references*.

A **root-to-leaf** path is a path starting from the root and ending at any leaf node. A **leaf** is a node with no children.

&nbsp;

Example 1:**

```

**Input:** root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
**Output:** [[5,4,11,2],[5,8,4,5]]
**Explanation:** There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22

```

Example 2:**

```

**Input:** root = [1,2,3], targetSum = 5
**Output:** []

```

Example 3:**

```

**Input:** root = [1,2], targetSum = 0
**Output:** []

```

&nbsp;

**Constraints:**

	- The number of nodes in the tree is in the range `[0, 5000]`.

	- `-1000 &lt;= Node.val &lt;= 1000`

	- `-1000 &lt;= targetSum &lt;= 1000`

---
