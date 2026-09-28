# Subtree of Another Tree

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/subtree-of-another-tree/submissions/2155502304/](https://leetcode.com/problems/subtree-of-another-tree/submissions/2155502304/) |
| **Problem ID** | subtree-of-another-tree |
| **Language** | Java |
| **Runtime** | 3 ms |
| **Memory** | 46280000 MB |
| **Accepted At** | 2026-09-28T03:29:18.000Z |

## Tags

`Tree`, `Depth-First Search`, `String Matching`, `Binary Tree`, `Hash Function`

## Problem Statement

Given the roots of two binary trees `root` and `subRoot`, return `true` if there is a subtree of `root` with the same structure and node values of` subRoot` and `false` otherwise.

A subtree of a binary tree `tree` is a tree that consists of a node in `tree` and all of this node&#39;s descendants. The tree `tree` could also be considered as a subtree of itself.

&nbsp;

Example 1:**

```

**Input:** root = [3,4,5,1,2], subRoot = [4,1,2]
**Output:** true

```

Example 2:**

```

**Input:** root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
**Output:** false

```

&nbsp;

**Constraints:**

	- The number of nodes in the `root` tree is in the range `[1, 2000]`.

	- The number of nodes in the `subRoot` tree is in the range `[1, 1000]`.

	- `-104 &lt;= root.val &lt;= 104`

	- `-104 &lt;= subRoot.val &lt;= 104`

---
