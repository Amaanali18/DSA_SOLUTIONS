# Number of Provinces

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/number-of-provinces/submissions/2175305588/](https://leetcode.com/problems/number-of-provinces/submissions/2175305588/) |
| **Problem ID** | number-of-provinces |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 46808000 MB |
| **Accepted At** | 2026-10-18T10:33:41.000Z |

## Tags

`Depth-First Search`, `Breadth-First Search`, `Union-Find`, `Graph Theory`

## Problem Statement

There are `n` cities. Some of them are connected, while some are not. If city `a` is connected directly with city `b`, and city `b` is connected directly with city `c`, then city `a` is connected indirectly with city `c`.

A **province** is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an `n x n` matrix `isConnected` where `isConnected[i][j] = 1` if the `ith` city and the `jth` city are directly connected, and `isConnected[i][j] = 0` otherwise.

Return *the total number of **provinces***.

&nbsp;

Example 1:**

```

**Input:** isConnected = [[1,1,0],[1,1,0],[0,0,1]]
**Output:** 2

```

Example 2:**

```

**Input:** isConnected = [[1,0,0],[0,1,0],[0,0,1]]
**Output:** 3

```

&nbsp;

**Constraints:**

	- `1 &lt;= n &lt;= 200`

	- `n == isConnected.length`

	- `n == isConnected[i].length`

	- `isConnected[i][j]` is `1` or `0`.

	- `isConnected[i][i] == 1`

	- `isConnected[i][j] == isConnected[j][i]`

---
