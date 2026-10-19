# Number of Enclaves

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/number-of-enclaves/submissions/2175879328/](https://leetcode.com/problems/number-of-enclaves/submissions/2175879328/) |
| **Problem ID** | number-of-enclaves |
| **Language** | Java |
| **Runtime** | 10 ms |
| **Memory** | 58816000 MB |
| **Accepted At** | 2026-10-19T04:22:07.000Z |

## Tags

`Array`, `Depth-First Search`, `Breadth-First Search`, `Union-Find`, `Matrix`

## Problem Statement

You are given an `m x n` binary matrix `grid`, where `0` represents a sea cell and `1` represents a land cell.

A **move** consists of walking from one land cell to another adjacent (**4-directionally**) land cell or walking off the boundary of the `grid`.

Return *the number of land cells in* `grid` *for which we cannot walk off the boundary of the grid in any number of **moves***.

&nbsp;

Example 1:**

```

**Input:** grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
**Output:** 3
**Explanation:** There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.

```

Example 2:**

```

**Input:** grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
**Output:** 0
**Explanation:** All 1s are either on the boundary or can reach the boundary.

```

&nbsp;

**Constraints:**

	- `m == grid.length`

	- `n == grid[i].length`

	- `1 &lt;= m, n &lt;= 500`

	- `grid[i][j]` is either `0` or `1`.

---
