# Jump Game III

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/jump-game-iii/description/](https://leetcode.com/problems/jump-game-iii/description/) |
| **Problem ID** | jump-game-iii |
| **Language** | java |
| **Runtime** | 0 ms |
| **Memory** | 0 MB |
| **Accepted At** | 2026-10-07T06:11:18.225Z |

## Tags

`Array`, `Depth-First Search`, `Breadth-First Search`

## Problem Statement

Given an array of non-negative integers `arr`, you are initially positioned at `start`&nbsp;index of the array. When you are at index `i`, you can jump&nbsp;to `i + arr[i]` or `i - arr[i]`, check if you can reach&nbsp;**any** index with value 0.

Notice that you can not jump outside of the array at any time.

&nbsp;

Example 1:**

```
**Input:** arr = [4,2,3,0,3,1,2], start = 5
**Output:** true
**Explanation:** 
All possible ways to reach at index 3 with value 0 are: 
index 5 -&gt; index 4 -&gt; index 1 -&gt; index 3 
index 5 -&gt; index 6 -&gt; index 4 -&gt; index 1 -&gt; index 3 

```

Example 2:**

```
**Input:** arr = [4,2,3,0,3,1,2], start = 0
**Output:** true 
**Explanation: 
**One possible way to reach at index 3 with value 0 is: 
index 0 -&gt; index 4 -&gt; index 1 -&gt; index 3

```

Example 3:**

```
**Input:** arr = [3,0,2,1,2], start = 2
**Output:** false
**Explanation: **There is no way to reach at index 1 with value 0.

```

&nbsp;

**Constraints:**

	- `1 &lt;= arr.length &lt;= 5 * 104`

	- `0 &lt;= arr[i] &lt;&nbsp;arr.length`

	- `0 &lt;= start &lt; arr.length`

---
