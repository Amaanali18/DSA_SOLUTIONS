# Evaluate Boolean Binary Tree

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/evaluate-boolean-binary-tree/submissions/2144252465/](https://leetcode.com/problems/evaluate-boolean-binary-tree/submissions/2144252465/) |
| **Problem ID** | evaluate-boolean-binary-tree |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 46516000 MB |
| **Accepted At** | 2026-09-17T03:35:45.000Z |

## Tags

`Tree`, `Depth-First Search`, `Binary Tree`

## Problem Statement

You are given the `root` of a **full binary tree** with the following properties:

	- **Leaf nodes** have either the value `0` or `1`, where `0` represents `False` and `1` represents `True`.

	- **Non-leaf nodes** have either the value `2` or `3`, where `2` represents the boolean `OR` and `3` represents the boolean `AND`.

The **evaluation** of a node is as follows:

	- If the node is a leaf node, the evaluation is the **value** of the node, i.e. `True` or `False`.

	- Otherwise, **evaluate** the node&#39;s two children and **apply** the boolean operation of its value with the children&#39;s evaluations.

Return* the boolean result of **evaluating** the *`root`* node.*

A **full binary tree** is a binary tree where each node has either `0` or `2` children.

A **leaf node** is a node that has zero children.

&nbsp;

Example 1:**

```

**Input:** root = [2,1,3,null,null,0,1]
**Output:** true
**Explanation:** The above diagram illustrates the evaluation process.
The AND node evaluates to False AND True = False.
The OR node evaluates to True OR False = True.
The root node evaluates to True, so we return true.
```

Example 2:**

```

**Input:** root = [0]
**Output:** false
**Explanation:** The root node is a leaf node and it evaluates to false, so we return false.

```

&nbsp;

**Constraints:**

	- The number of nodes in the tree is in the range `[1, 1000]`.

	- `0 &lt;= Node.val &lt;= 3`

	- Every node has either `0` or `2` children.

	- Leaf nodes have a value of `0` or `1`.

	- Non-leaf nodes have a value of `2` or `3`.

---
