# Is Graph Bipartite?

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/is-graph-bipartite/submissions/2181841500/](https://leetcode.com/problems/is-graph-bipartite/submissions/2181841500/) |
| **Problem ID** | is-graph-bipartite |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 46708000 MB |
| **Accepted At** | 2026-10-26T02:45:09.000Z |

## Tags

`Depth-First Search`, `Breadth-First Search`, `Union-Find`, `Graph Theory`, `Graph Coloring`, `Bipartite Graph`

## Problem Statement

There is an **undirected** graph with `n` nodes, where each node is numbered between `0` and `n - 1`. You are given a 2D array `graph`, where `graph[u]` is an array of nodes that node `u` is adjacent to. More formally, for each `v` in `graph[u]`, there is an undirected edge between node `u` and node `v`. The graph has the following properties:

	- There are no self-edges (`graph[u]` does not contain `u`).

	- There are no parallel edges (`graph[u]` does not contain duplicate values).

	- If `v` is in `graph[u]`, then `u` is in `graph[v]` (the graph is undirected).

	- The graph may not be connected, meaning there may be two nodes `u` and `v` such that there is no path between them.

A graph is **bipartite** if the nodes can be partitioned into two independent sets `A` and `B` such that **every** edge in the graph connects a node in set `A` and a node in set `B`.

Return `true`* if and only if it is **bipartite***.

&nbsp;

Example 1:**

```

**Input:** graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
**Output:** false
**Explanation:** There is no way to partition the nodes into two independent sets such that every edge connects a node in one and a node in the other.
```

Example 2:**

```

**Input:** graph = [[1,3],[0,2],[1,3],[0,2]]
**Output:** true
**Explanation:** We can partition the nodes into two sets: {0, 2} and {1, 3}.
```

&nbsp;

**Constraints:**

	- `graph.length == n`

	- `1 &lt;= n &lt;= 100`

	- `0 &lt;= graph[u].length &lt; n`

	- `0 &lt;= graph[u][i] &lt;= n - 1`

	- `graph[u]`&nbsp;does not contain&nbsp;`u`.

	- All the values of `graph[u]` are **unique**.

	- If `graph[u]` contains `v`, then `graph[v]` contains `u`.

## Constraints

- graph.length == n
- 1 &lt;= n &lt;= 100
- 0 &lt;= graph[u].length &lt; n
- 0 &lt;= graph[u][i] &lt;= n - 1
- graph[u]&nbsp;does not contain&nbsp;u.

---
