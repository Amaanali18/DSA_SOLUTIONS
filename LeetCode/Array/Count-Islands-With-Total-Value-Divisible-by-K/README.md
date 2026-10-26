# Count Islands With Total Value Divisible by K

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k/submissions/2181850262/?envType=daily-question&envId=2026-10-26](https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k/submissions/2181850262/?envType=daily-question&envId=2026-10-26) |
| **Problem ID** | count-islands-with-total-value-divisible-by-k |
| **Language** | Java |
| **Runtime** | 19 ms |
| **Memory** | 111744000 MB |
| **Accepted At** | 2026-10-26T03:07:17.000Z |

## Tags

`Array`, `Depth-First Search`, `Breadth-First Search`, `Union-Find`, `Matrix`

## Problem Statement

You are given an `m x n` matrix `grid` and a positive integer `k`. An **island** is a group of **positive** integers (representing land) that are **4-directionally** connected (horizontally or vertically).

The **total value** of an island is the sum of the values of all cells in the island.

Return the number of islands with a total value **divisible by** `k`.

&nbsp;

Example 1:**

**Input:** grid = [[0,2,1,0,0],[0,5,0,0,5],[0,0,1,0,0],[0,1,4,7,0],[0,2,0,0,8]], k = 5

**Output:** 2

**Explanation:**

The grid contains four islands. The islands highlighted in blue have a total value that is divisible by 5, while the islands highlighted in red do not.

Example 2:**

**Input:** grid = [[3,0,3,0], [0,3,0,3], [3,0,3,0]], k = 3

**Output:** 6

**Explanation:**

The grid contains six islands, each with a total value that is divisible by 3.

&nbsp;

**Constraints:**

	- `m == grid.length`

	- `n == grid[i].length`

	- `1 &lt;= m, n &lt;= 1000`

	- `1 &lt;= m * n &lt;= 105`

	- `0 &lt;= grid[i][j] &lt;= 106`

	- `1 &lt;= k &lt;= 106`

---
