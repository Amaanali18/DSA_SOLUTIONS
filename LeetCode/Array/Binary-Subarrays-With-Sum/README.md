# Binary Subarrays With Sum

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/binary-subarrays-with-sum/submissions/2174551518/](https://leetcode.com/problems/binary-subarrays-with-sum/submissions/2174551518/) |
| **Problem ID** | binary-subarrays-with-sum |
| **Language** | Java |
| **Runtime** | 23 ms |
| **Memory** | 49988000 MB |
| **Accepted At** | 2026-10-17T12:33:41.000Z |

## Tags

`Array`, `Hash Table`, `Sliding Window`, `Prefix Sum`

## Problem Statement

Given a binary array `nums` and an integer `goal`, return *the number of non-empty **subarrays** with a sum* `goal`.

A **subarray** is a contiguous part of the array.

&nbsp;

Example 1:**

```

**Input:** nums = [1,0,1,0,1], goal = 2
**Output:** 4
**Explanation:** The 4 subarrays are bolded and underlined below:
[**1,0,1**,0,1]
[**1,0,1,0**,1]
[1,**0,1,0,1**]
[1,0,**1,0,1**]

```

Example 2:**

```

**Input:** nums = [0,0,0,0,0], goal = 0
**Output:** 15

```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 3 * 104`

	- `nums[i]` is either `0` or `1`.

	- `0 &lt;= goal &lt;= nums.length`

---
