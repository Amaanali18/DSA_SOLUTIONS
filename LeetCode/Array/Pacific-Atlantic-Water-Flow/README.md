# Pacific Atlantic Water Flow

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/pacific-atlantic-water-flow/submissions/2173655240/?envType=problem-list-v2&envId=oizxjoit](https://leetcode.com/problems/pacific-atlantic-water-flow/submissions/2173655240/?envType=problem-list-v2&envId=oizxjoit) |
| **Problem ID** | pacific-atlantic-water-flow |
| **Language** | Java |
| **Runtime** | 6 ms |
| **Memory** | 46816000 MB |
| **Accepted At** | 2026-10-16T07:38:22.000Z |

## Tags

`Array`, `Depth-First Search`, `Breadth-First Search`, `Matrix`

## Problem Statement

There is an `m x n` rectangular island that borders both the **Pacific Ocean** and **Atlantic Ocean**. The **Pacific Ocean** touches the island&#39;s left and top edges, and the **Atlantic Ocean** touches the island&#39;s right and bottom edges.

The island is partitioned into a grid of square cells. You are given an `m x n` integer matrix `heights` where `heights[r][c]` represents the **height above sea level** of the cell at coordinate `(r, c)`.

The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell&#39;s height is **less than or equal to** the current cell&#39;s height. Water can flow from any cell adjacent to an ocean into the ocean.

Return *a **2D list** of grid coordinates *`result`* where *`result[i] = [ri, ci]`* denotes that rain water can flow from cell *`(ri, ci)`* to **both** the Pacific and Atlantic oceans*.

&nbsp;

Example 1:**

```

**Input:** heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
**Output:** [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
**Explanation:** The following cells can flow to the Pacific and Atlantic oceans, as shown below:
[0,4]: [0,4] -&gt; Pacific Ocean 
&nbsp;      [0,4] -&gt; Atlantic Ocean
[1,3]: [1,3] -&gt; [0,3] -&gt; Pacific Ocean 
&nbsp;      [1,3] -&gt; [1,4] -&gt; Atlantic Ocean
[1,4]: [1,4] -&gt; [1,3] -&gt; [0,3] -&gt; Pacific Ocean 
&nbsp;      [1,4] -&gt; Atlantic Ocean
[2,2]: [2,2] -&gt; [1,2] -&gt; [0,2] -&gt; Pacific Ocean 
&nbsp;      [2,2] -&gt; [2,3] -&gt; [2,4] -&gt; Atlantic Ocean
[3,0]: [3,0] -&gt; Pacific Ocean 
&nbsp;      [3,0] -&gt; [4,0] -&gt; Atlantic Ocean
[3,1]: [3,1] -&gt; [3,0] -&gt; Pacific Ocean 
&nbsp;      [3,1] -&gt; [4,1] -&gt; Atlantic Ocean
[4,0]: [4,0] -&gt; Pacific Ocean 
       [4,0] -&gt; Atlantic Ocean
Note that there are other possible paths for these cells to flow to the Pacific and Atlantic oceans.

```

Example 2:**

```

**Input:** heights = [[1]]
**Output:** [[0,0]]
**Explanation:** The water can flow from the only cell to the Pacific and Atlantic oceans.

```

&nbsp;

**Constraints:**

	- `m == heights.length`

	- `n == heights[r].length`

	- `1 &lt;= m, n &lt;= 200`

	- `0 &lt;= heights[r][c] &lt;= 105`

---
