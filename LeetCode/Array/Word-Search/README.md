# Word Search

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/word-search/submissions/2197275612/](https://leetcode.com/problems/word-search/submissions/2197275612/) |
| **Problem ID** | word-search |
| **Language** | Java |
| **Runtime** | 160 ms |
| **Memory** | 42672000 MB |
| **Accepted At** | 2026-11-16T12:01:20.000Z |

## Tags

`Array`, `String`, `Backtracking`, `Depth-First Search`, `Matrix`

## Problem Statement

Given an `m x n` grid of characters `board` and a string `word`, return `true` *if* `word` *exists in the grid*.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

&nbsp;

Example 1:**

```

**Input:** board = [[&quot;A&quot;,&quot;B&quot;,&quot;C&quot;,&quot;E&quot;],[&quot;S&quot;,&quot;F&quot;,&quot;C&quot;,&quot;S&quot;],[&quot;A&quot;,&quot;D&quot;,&quot;E&quot;,&quot;E&quot;]], word = &quot;ABCCED&quot;
**Output:** true

```

Example 2:**

```

**Input:** board = [[&quot;A&quot;,&quot;B&quot;,&quot;C&quot;,&quot;E&quot;],[&quot;S&quot;,&quot;F&quot;,&quot;C&quot;,&quot;S&quot;],[&quot;A&quot;,&quot;D&quot;,&quot;E&quot;,&quot;E&quot;]], word = &quot;SEE&quot;
**Output:** true

```

Example 3:**

```

**Input:** board = [[&quot;A&quot;,&quot;B&quot;,&quot;C&quot;,&quot;E&quot;],[&quot;S&quot;,&quot;F&quot;,&quot;C&quot;,&quot;S&quot;],[&quot;A&quot;,&quot;D&quot;,&quot;E&quot;,&quot;E&quot;]], word = &quot;ABCB&quot;
**Output:** false

```

&nbsp;

**Constraints:**

	- `m == board.length`

	- `n = board[i].length`

	- `1 &lt;= m, n &lt;= 6`

	- `1 &lt;= word.length &lt;= 15`

	- `board` and `word` consists of only lowercase and uppercase English letters.

&nbsp;

**Follow up:** Could you use search pruning to make your solution faster with a larger `board`?

## Constraints

- m == board.length
- n = board[i].length
- 1 &lt;= m, n &lt;= 6
- 1 &lt;= word.length &lt;= 15
- board and word consists of only lowercase and uppercase English letters.

---
