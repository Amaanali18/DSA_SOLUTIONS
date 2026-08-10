# Recover Binary Search Tree

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/recover-binary-search-tree/submissions/2100953150/?envType=problem-list-v2&envId=binary-search-tree](https://leetcode.com/problems/recover-binary-search-tree/submissions/2100953150/?envType=problem-list-v2&envId=binary-search-tree) |
| **Problem ID** | recover-binary-search-tree |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 46236000 MB |
| **Accepted At** | 2026-08-10T02:28:06.000Z |

## Tags

`Tree`, `Depth-First Search`, `Binary Search Tree`, `Binary Tree`

## Problem Statement

You are given the `root` of a binary search tree (BST), where the values of **exactly** two nodes of the tree were swapped by mistake. *Recover the tree without changing its structure*.

&nbsp;

Example 1:**

```

**Input:** root = [1,3,null,null,2]
**Output:** [3,1,null,null,2]
**Explanation:** 3 cannot be a left child of 1 because 3 &gt; 1. Swapping 1 and 3 makes the BST valid.

```

Example 2:**

```

**Input:** root = [3,1,4,null,null,2]
**Output:** [2,1,4,null,null,3]
**Explanation:** 2 cannot be in the right subtree of 3 because 2 &lt; 3. Swapping 2 and 3 makes the BST valid.

```

&nbsp;

**Constraints:**

	- The number of nodes in the tree is in the range `[2, 1000]`.

	- `-231 &lt;= Node.val &lt;= 231 - 1`

&nbsp;
**Follow up:** A solution using `O(n)` space is pretty straight-forward. Could you devise a constant `O(1)` space solution?

## Constraints

- The number of nodes in the tree is in the range [2, 1000].
- -231 &lt;= Node.val &lt;= 231 - 1

---
