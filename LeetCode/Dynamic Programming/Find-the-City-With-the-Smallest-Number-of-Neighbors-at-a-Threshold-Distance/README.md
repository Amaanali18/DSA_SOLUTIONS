# Find the City With the Smallest Number of Neighbors at a Threshold Distance

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/submissions/2179658985/](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/submissions/2179658985/) |
| **Problem ID** | find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance |
| **Language** | Java |
| **Runtime** | 8 ms |
| **Memory** | 45444000 MB |
| **Accepted At** | 2026-10-23T12:55:58.000Z |

## Tags

`Dynamic Programming`, `Graph Theory`, `Shortest Path`, `Dijkstra's Algorithm`, `Bellman–Ford Algorithm`, `Floyd–Warshall Algorithm`

## Problem Statement

There are `n` cities numbered from `0` to `n-1`. Given the array `edges` where `edges[i] = [fromi, toi, weighti]` represents a bidirectional and weighted edge between cities `fromi` and `toi`, and given the integer `distanceThreshold`.

Return the city with the smallest number of cities that are reachable through some path and whose distance is **at most** `distanceThreshold`, If there are multiple such cities, return the city with the greatest number.

Notice that the distance of a path connecting cities ***i*** and ***j*** is equal to the sum of the edges&#39; weights along that path.

&nbsp;

Example 1:**

```

**Input:** n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4
**Output:** 3
**Explanation: **The figure above describes the graph.&nbsp;
The neighboring cities at a distanceThreshold = 4 for each city are:
City 0 -&gt; [City 1, City 2]&nbsp;
City 1 -&gt; [City 0, City 2, City 3]&nbsp;
City 2 -&gt; [City 0, City 1, City 3]&nbsp;
City 3 -&gt; [City 1, City 2]&nbsp;
Cities 0 and 3 have 2 neighboring cities at a distanceThreshold = 4, but we have to return city 3 since it has the greatest number.

```

Example 2:**

```

**Input:** n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2
**Output:** 0
**Explanation: **The figure above describes the graph.&nbsp;
The neighboring cities at a distanceThreshold = 2 for each city are:
City 0 -&gt; [City 1]&nbsp;
City 1 -&gt; [City 0, City 4]&nbsp;
City 2 -&gt; [City 3, City 4]&nbsp;
City 3 -&gt; [City 2, City 4]
City 4 -&gt; [City 1, City 2, City 3]&nbsp;
The city 0 has 1 neighboring city at a distanceThreshold = 2.

```

&nbsp;

**Constraints:**

	- `2 &lt;= n &lt;= 100`

	- `1 &lt;= edges.length &lt;= n * (n - 1) / 2`

	- `edges[i].length == 3`

	- `0 &lt;= fromi &lt; toi &lt; n`

	- `1 &lt;= weighti,&nbsp;distanceThreshold &lt;= 10^4`

	- All pairs `(fromi, toi)` are distinct.

---
