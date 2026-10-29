# Unique Paths II

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/unique-paths-ii/submissions/2184366847/](https://leetcode.com/problems/unique-paths-ii/submissions/2184366847/) |
| **Problem ID** | unique-paths-ii |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 42880000 MB |
| **Accepted At** | 2026-10-29T02:45:20.000Z |

## Tags

`Array`, `Dynamic Programming`, `Matrix`

## Problem Statement

You are given an `m x n` integer array `grid`. There is a robot initially located at the top-left corner (i.e., `grid[0][0]`). The robot tries to move to the **bottom-right corner** (i.e., `grid[m - 1][n - 1]`). The robot can only move either down or right at any point in time.

An obstacle and space are marked as `1` or `0` respectively in `grid`. A path that the robot takes cannot include **any** square that is an obstacle.

Return *the number of possible unique paths that the robot can take to reach the bottom-right corner*.

The testcases are generated so that the answer will be less than or equal to `2 * 109`.

&nbsp;

Example 1:**

```

**Input:** obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
**Output:** 2
**Explanation:** There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -&gt; Right -&gt; Down -&gt; Down
2. Down -&gt; Down -&gt; Right -&gt; Right

```

Example 2:**

```

**Input:** obstacleGrid = [[0,1],[0,0]]
**Output:** 1

```

&nbsp;

**Constraints:**

	- `m == obstacleGrid.length`

	- `n == obstacleGrid[i].length`

	- `1 &lt;= m, n &lt;= 100`

	- `obstacleGrid[i][j]` is `0` or `1`.

---
