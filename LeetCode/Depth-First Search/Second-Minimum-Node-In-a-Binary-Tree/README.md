# Second Minimum Node In a Binary Tree

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/submissions/2098652746/](https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/submissions/2098652746/) |
| **Problem ID** | second-minimum-node-in-a-binary-tree |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 42124000 MB |
| **Accepted At** | 2026-08-08T05:07:44.000Z |

## Tags

`Tree`, `Depth-First Search`, `Binary Tree`

## Problem Statement

Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly `two` or `zero` sub-node. If the node has two sub-nodes, then this node&#39;s value is the smaller value among its two sub-nodes. More formally, the property&nbsp;`root.val = min(root.left.val, root.right.val)`&nbsp;always holds.

Given such a binary tree, you need to output the second minimum value in the set made of all the nodes&#39; value in the whole tree.

If no such second minimum value exists, output -1 instead.

&nbsp;

&nbsp;

Example 1:**

```

**Input:** root = [2,2,5,null,null,5,7]
**Output:** 5
**Explanation:** The smallest value is 2, the second smallest value is 5.

```

Example 2:**

```

**Input:** root = [2,2,2]
**Output:** -1
**Explanation:** The smallest value is 2, but there isn&#39;t any second smallest value.

```

&nbsp;

**Constraints:**

	- The number of nodes in the tree is in the range `[1, 25]`.

	- `1 &lt;= Node.val &lt;= 231 - 1`

	- `root.val == min(root.left.val, root.right.val)`&nbsp;for each internal node of the tree.

---
