# Subarrays with K Different Integers

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Hard |
| **URL** | [https://leetcode.com/problems/subarrays-with-k-different-integers/submissions/2175106193/](https://leetcode.com/problems/subarrays-with-k-different-integers/submissions/2175106193/) |
| **Problem ID** | subarrays-with-k-different-integers |
| **Language** | Java |
| **Runtime** | 46 ms |
| **Memory** | 48516000 MB |
| **Accepted At** | 2026-10-18T04:49:13.000Z |

## Tags

`Array`, `Hash Table`, `Sliding Window`, `Counting`

## Problem Statement

Given an integer array `nums` and an integer `k`, return *the number of **good subarrays** of *`nums`.

A **good array** is an array where the number of different integers in that array is exactly `k`.

	- For example, `[1,2,3,1,2]` has `3` different integers: `1`, `2`, and `3`.

A **subarray** is a **contiguous** part of an array.

&nbsp;

Example 1:**

```

**Input:** nums = [1,2,1,2,3], k = 2
**Output:** 7
**Explanation:** Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

```

Example 2:**

```

**Input:** nums = [1,2,1,3,4], k = 3
**Output:** 3
**Explanation:** Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].

```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 2 * 104`

	- `1 &lt;= nums[i], k &lt;= nums.length`

---
