# Populating Next Right Pointers in Each Node

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/2156565163/](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/2156565163/) |
| **Problem ID** | populating-next-right-pointers-in-each-node |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 46564000 MB |
| **Accepted At** | 2026-09-29T02:36:44.000Z |

## Tags

`Linked List`, `Tree`, `Depth-First Search`, `Breadth-First Search`, `Binary Tree`

## Problem Statement

You are given a **perfect binary tree** where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

```

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}

```

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to `NULL`.

Initially, all next pointers are set to `NULL`.

&nbsp;

Example 1:**

```

**Input:** root = [1,2,3,4,5,6,7]
**Output:** [1,#,2,3,#,4,5,6,7,#]
**Explanation: **Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with &#39;#&#39; signifying the end of each level.

```

Example 2:**

```

**Input:** root = []
**Output:** []

```

&nbsp;

**Constraints:**

	- The number of nodes in the tree is in the range `[0, 212 - 1]`.

	- `-1000 &lt;= Node.val &lt;= 1000`

&nbsp;

**Follow-up:**

	- You may only use constant extra space.

	- The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.

## Constraints

- The number of nodes in the tree is in the range [0, 212 - 1].
- -1000 &lt;= Node.val &lt;= 1000

---
