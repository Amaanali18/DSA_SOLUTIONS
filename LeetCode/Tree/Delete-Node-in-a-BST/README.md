# Delete Node in a BST

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/delete-node-in-a-bst/submissions/2099064900/?envType=problem-list-v2&envId=binary-search-tree](https://leetcode.com/problems/delete-node-in-a-bst/submissions/2099064900/?envType=problem-list-v2&envId=binary-search-tree) |
| **Problem ID** | delete-node-in-a-bst |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 47472000 MB |
| **Accepted At** | 2026-08-08T12:08:07.000Z |

## Tags

`Tree`, `Binary Search Tree`, `Binary Tree`

## Problem Statement

Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return *the **root node reference** (possibly updated) of the BST*.

Basically, the deletion can be divided into two stages:

	- Search for a node to remove.

	- If the node is found, delete the node.

&nbsp;

Example 1:**

```

**Input:** root = [5,3,6,2,4,null,7], key = 3
**Output:** [5,4,6,2,null,null,7]
**Explanation:** Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it&#39;s also accepted.

```

Example 2:**

```

**Input:** root = [5,3,6,2,4,null,7], key = 0
**Output:** [5,3,6,2,4,null,7]
**Explanation:** The tree does not contain a node with value = 0.

```

Example 3:**

```

**Input:** root = [], key = 0
**Output:** []

```

&nbsp;

**Constraints:**

	- The number of nodes in the tree is in the range `[0, 104]`.

	- `-105 &lt;= Node.val &lt;= 105`

	- Each node has a **unique** value.

	- `root` is a valid binary search tree.

	- `-105 &lt;= key &lt;= 105`

&nbsp;

**Follow up:** Could you solve it with time complexity `O(height of tree)`?

## Constraints

- The number of nodes in the tree is in the range [0, 104].
- -105 &lt;= Node.val &lt;= 105

---
