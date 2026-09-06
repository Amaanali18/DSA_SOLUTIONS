# Concatenate Array With Reverse

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/concatenate-array-with-reverse/submissions/2132511364/](https://leetcode.com/problems/concatenate-array-with-reverse/submissions/2132511364/) |
| **Problem ID** | concatenate-array-with-reverse |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 47272000 MB |
| **Accepted At** | 2026-09-06T06:08:57.000Z |

## Tags

`Array`, `Simulation`

## Problem Statement

You are given an integer array `nums` of length `n`.

Construct a new array `ans` of length `2 * n` such that the first `n` elements are the same as `nums`, and the next `n` elements are the elements of `nums` in reverse order.

Formally, for `0 &lt;= i &lt;= n - 1`:

	- `ans[i] = nums[i]`

	- `ans[i + n] = nums[n - i - 1]`

Return an integer array `ans`.

&nbsp;

Example 1:**

**Input:** nums = [1,2,3]

**Output:** [1,2,3,3,2,1]

**Explanation:**

The first `n` elements of `ans` are the same as `nums`.

For the next `n = 3` elements, each element is taken from `nums` in reverse order:

	- `ans[3] = nums[2] = 3`

	- `ans[4] = nums[1] = 2`

	- `ans[5] = nums[0] = 1`

Thus, `ans = [1, 2, 3, 3, 2, 1]`.

Example 2:**

**Input:** nums = [1]

**Output:** [1,1]

**Explanation:**

The array remains the same when reversed. Thus, `ans = [1, 1]`.

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 100`

	- `1 &lt;= nums[i] &lt;= 100`

---
