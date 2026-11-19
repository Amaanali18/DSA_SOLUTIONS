# Kth Smallest Element in a Sorted Matrix

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/submissions/2199415666/](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/submissions/2199415666/) |
| **Problem ID** | kth-smallest-element-in-a-sorted-matrix |
| **Language** | Java |
| **Runtime** | 30 ms |
| **Memory** | 50656000 MB |
| **Accepted At** | 2026-11-19T15:03:24.000Z |

## Tags

`Array`, `Binary Search`, `Sorting`, `Heap (Priority Queue)`, `Matrix`

## Problem Statement

Given an `n x n` `matrix` where each of the rows and columns is sorted in ascending order, return *the* `kth` *smallest element in the matrix*.

Note that it is the `kth` smallest element **in the sorted order**, not the `kth` **distinct** element.

You must find a solution with a memory complexity better than `O(n2)`.

&nbsp;

Example 1:**

```

**Input:** matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
**Output:** 13
**Explanation:** The elements in the matrix are [1,5,9,10,11,12,13,**13**,15], and the 8th smallest number is 13

```

Example 2:**

```

**Input:** matrix = [[-5]], k = 1
**Output:** -5

```

&nbsp;

**Constraints:**

	- `n == matrix.length == matrix[i].length`

	- `1 &lt;= n &lt;= 300`

	- `-109 &lt;= matrix[i][j] &lt;= 109`

	- All the rows and columns of `matrix` are **guaranteed** to be sorted in **non-decreasing order**.

	- `1 &lt;= k &lt;= n2`

&nbsp;

**Follow up:**

	- Could you solve the problem with a constant memory (i.e., `O(1)` memory complexity)?

	- Could you solve the problem in `O(n)` time complexity? The solution may be too advanced for an interview but you may find reading this paper fun.

## Constraints

- n == matrix.length == matrix[i].length
- 1 &lt;= n &lt;= 300
- -109 &lt;= matrix[i][j] &lt;= 109

---
