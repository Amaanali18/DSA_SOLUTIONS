# Number of Islands

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/number-of-islands/submissions/2175309484/](https://leetcode.com/problems/number-of-islands/submissions/2175309484/) |
| **Problem ID** | number-of-islands |
| **Language** | Java |
| **Runtime** | 3 ms |
| **Memory** | 51992000 MB |
| **Accepted At** | 2026-10-18T10:40:25.000Z |

## Tags

`Array`, `Depth-First Search`, `Breadth-First Search`, `Union-Find`, `Matrix`

## Problem Statement

Given an `m x n` 2D binary grid `grid` which represents a map of `&#39;1&#39;`s (land) and `&#39;0&#39;`s (water), return *the number of islands*.

An **island** is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

&nbsp;

Example 1:**

```

**Input:** grid = [
  [&quot;1&quot;,&quot;1&quot;,&quot;1&quot;,&quot;1&quot;,&quot;0&quot;],
  [&quot;1&quot;,&quot;1&quot;,&quot;0&quot;,&quot;1&quot;,&quot;0&quot;],
  [&quot;1&quot;,&quot;1&quot;,&quot;0&quot;,&quot;0&quot;,&quot;0&quot;],
  [&quot;0&quot;,&quot;0&quot;,&quot;0&quot;,&quot;0&quot;,&quot;0&quot;]
]
**Output:** 1

```

Example 2:**

```

**Input:** grid = [
  [&quot;1&quot;,&quot;1&quot;,&quot;0&quot;,&quot;0&quot;,&quot;0&quot;],
  [&quot;1&quot;,&quot;1&quot;,&quot;0&quot;,&quot;0&quot;,&quot;0&quot;],
  [&quot;0&quot;,&quot;0&quot;,&quot;1&quot;,&quot;0&quot;,&quot;0&quot;],
  [&quot;0&quot;,&quot;0&quot;,&quot;0&quot;,&quot;1&quot;,&quot;1&quot;]
]
**Output:** 3

```

&nbsp;

**Constraints:**

	- `m == grid.length`

	- `n == grid[i].length`

	- `1 &lt;= m, n &lt;= 300`

	- `grid[i][j]` is `&#39;0&#39;` or `&#39;1&#39;`.

---
