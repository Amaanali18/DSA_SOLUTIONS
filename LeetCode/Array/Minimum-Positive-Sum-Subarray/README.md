# Minimum Positive Sum Subarray 

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/minimum-positive-sum-subarray/submissions/2195656729/?envType=daily-question&envId=2026-11-14](https://leetcode.com/problems/minimum-positive-sum-subarray/submissions/2195656729/?envType=daily-question&envId=2026-11-14) |
| **Problem ID** | minimum-positive-sum-subarray |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 45520000 MB |
| **Accepted At** | 2026-11-14T03:39:28.000Z |

## Tags

`Array`, `Sliding Window`, `Prefix Sum`

## Problem Statement

You are given an integer array `nums` and **two** integers `l` and `r`. Your task is to find the **minimum** sum of a **subarray** whose size is between `l` and `r` (inclusive) and whose sum is greater than 0.

Return the **minimum** sum of such a subarray. If no such subarray exists, return -1.

A **subarray** is a contiguous non-empty sequence of elements within an array.

&nbsp;

Example 1:**

**Input:** nums = [3, -2, 1, 4], l = 2, r = 3

**Output:** 1

**Explanation:**

The subarrays of length between `l = 2` and `r = 3` where the sum is greater than 0 are:

	- `[3, -2]` with a sum of 1

	- `[1, 4]` with a sum of 5

	- `[3, -2, 1]` with a sum of 2

	- `[-2, 1, 4]` with a sum of 3

Out of these, the subarray `[3, -2]` has a sum of 1, which is the smallest positive sum. Hence, the answer is 1.

Example 2:**

**Input:** nums = [-2, 2, -3, 1], l = 2, r = 3

**Output:** -1

**Explanation:**

There is no subarray of length between `l` and `r` that has a sum greater than 0. So, the answer is -1.

Example 3:**

**Input:** nums = [1, 2, 3, 4], l = 2, r = 4

**Output:** 3

**Explanation:**

The subarray `[1, 2]` has a length of 2 and the minimum sum greater than 0. So, the answer is 3.

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 100`

	- `1 &lt;= l &lt;= r &lt;= nums.length`

	- `-1000 &lt;= nums[i] &lt;= 1000`

---
