# Trim a Binary Search Tree

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/trim-a-binary-search-tree/submissions/2158715022/](https://leetcode.com/problems/trim-a-binary-search-tree/submissions/2158715022/) |
| **Problem ID** | trim-a-binary-search-tree |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 46876000 MB |
| **Accepted At** | 2026-10-01T02:50:41.000Z |

## Tags

`Tree`, `Depth-First Search`, `Binary Search Tree`, `Binary Tree`

## Problem Statement

Given the `root` of a binary search tree and the lowest and highest boundaries as `low` and `high`, trim the tree so that all its elements lies in `[low, high]`. Trimming the tree should **not** change the relative structure of the elements that will remain in the tree (i.e., any node&#39;s descendant should remain a descendant). It can be proven that there is a **unique answer**.

Return *the root of the trimmed binary search tree*. Note that the root may change depending on the given bounds.

&nbsp;

Example 1:**

```

**Input:** root = [1,0,2], low = 1, high = 2
**Output:** [1,null,2]

```

Example 2:**

```

**Input:** root = [3,0,4,null,2,null,null,1], low = 1, high = 3
**Output:** [3,2,null,1]

```

&nbsp;

**Constraints:**

	- The number of nodes in the tree is in the range `[1, 104]`.

	- `0 &lt;= Node.val &lt;= 104`

	- The value of each node in the tree is **unique**.

	- `root` is guaranteed to be a valid binary search tree.

	- `0 &lt;= low &lt;= high &lt;= 104`

## Constraints

- The number of nodes in the tree is in the range [1, 104].
- 0 &lt;= Node.val &lt;= 104

---
