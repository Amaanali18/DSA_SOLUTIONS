# Swim in Rising Water

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Hard |
| **URL** | [https://leetcode.com/problems/swim-in-rising-water/submissions/2176964464/](https://leetcode.com/problems/swim-in-rising-water/submissions/2176964464/) |
| **Problem ID** | swim-in-rising-water |
| **Language** | Java |
| **Runtime** | 269 ms |
| **Memory** | 46916000 MB |
| **Accepted At** | 2026-10-20T10:19:24.000Z |

## Tags

`Array`, `Binary Search`, `Depth-First Search`, `Breadth-First Search`, `Union-Find`, `Minimax`, `Heap (Priority Queue)`, `Matrix`, `Dijkstra's Algorithm`

## Problem Statement

You are given an `n x n` integer matrix `grid` where each value `grid[i][j]` represents the elevation at that point `(i, j)`.

It starts raining, and water gradually rises over time. At time `t`, the water level is `t`, meaning **any** cell with elevation less than equal to `t` is submerged or reachable.

You can swim from a square to another 4-directionally adjacent square if and only if the elevation of both squares individually are at most `t`. You can swim infinite distances in zero time. Of course, you must stay within the boundaries of the grid during your swim.

Return *the minimum time until you can reach the bottom right square *`(n - 1, n - 1)`* if you start at the top left square *`(0, 0)`.

&nbsp;

Example 1:**

```

**Input:** grid = [[0,2],[1,3]]
**Output:** 3
Explanation:
At time 0, you are in grid location (0, 0).
You cannot go anywhere else because 4-directionally adjacent neighbors have a higher elevation than t = 0.
You cannot reach point (1, 1) until time 3.
When the depth of water is 3, we can swim anywhere inside the grid.

```

Example 2:**

```

**Input:** grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
**Output:** 16
**Explanation:** The final route is shown.
We need to wait until time 16 so that (0, 0) and (4, 4) are connected.

```

&nbsp;

**Constraints:**

	- `n == grid.length`

	- `n == grid[i].length`

	- `1 &lt;= n &lt;= 50`

	- `0 &lt;= grid[i][j] &lt;&nbsp;n2`

	- Each value `grid[i][j]` is **unique**.

## Constraints

- n == grid.length
- n == grid[i].length
- 1 &lt;= n &lt;= 50
- 0 &lt;= grid[i][j] &lt;&nbsp;n2

---
