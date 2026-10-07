# Jump Game II

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/jump-game-ii/submissions/2164971377/](https://leetcode.com/problems/jump-game-ii/submissions/2164971377/) |
| **Problem ID** | jump-game-ii |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 47280000 MB |
| **Accepted At** | 2026-10-07T06:05:51.000Z |

## Tags

`Array`, `Dynamic Programming`, `Greedy`

## Problem Statement

You are given a **0-indexed** array of integers `nums` of length `n`. You are initially positioned at&nbsp;index 0.

Each element `nums[i]` represents the maximum length of a forward jump from index `i`. In other words, if you are at index `i`, you can jump to any index `(i + j)`&nbsp;where:

	- `0 &lt;= j &lt;= nums[i]` and

	- `i + j &lt; n`

Return *the minimum number of jumps to reach index *`n - 1`. The test cases are generated such that you can reach index&nbsp;`n - 1`.

&nbsp;

Example 1:**

```

**Input:** nums = [2,3,1,1,4]
**Output:** 2
**Explanation:** The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

```

Example 2:**

```

**Input:** nums = [2,3,0,1,4]
**Output:** 2

```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 104`

	- `0 &lt;= nums[i] &lt;= 1000`

	- It&#39;s guaranteed that you can reach `nums[n - 1]`.

---
