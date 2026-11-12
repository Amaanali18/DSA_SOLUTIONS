# Longest Strictly Increasing or Strictly Decreasing Subarray

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/submissions/2194330267/?envType=daily-question&envId=2026-11-12](https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/submissions/2194330267/?envType=daily-question&envId=2026-11-12) |
| **Problem ID** | longest-strictly-increasing-or-strictly-decreasing-subarray |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 43684000 MB |
| **Accepted At** | 2026-11-12T04:44:42.000Z |

## Tags

`Array`

## Problem Statement

You are given an array of integers `nums`. Return *the length of the **longest** subarray of *`nums`* which is either **strictly increasing** or **strictly decreasing***.

&nbsp;

Example 1:**

**Input:** nums = [1,4,3,3,2]

**Output:** 2

**Explanation:**

The strictly increasing subarrays of `nums` are `[1]`, `[2]`, `[3]`, `[3]`, `[4]`, and `[1,4]`.

The strictly decreasing subarrays of `nums` are `[1]`, `[2]`, `[3]`, `[3]`, `[4]`, `[3,2]`, and `[4,3]`.

Hence, we return `2`.

Example 2:**

**Input:** nums = [3,3,3,3]

**Output:** 1

**Explanation:**

The strictly increasing subarrays of `nums` are `[3]`, `[3]`, `[3]`, and `[3]`.

The strictly decreasing subarrays of `nums` are `[3]`, `[3]`, `[3]`, and `[3]`.

Hence, we return `1`.

Example 3:**

**Input:** nums = [3,2,1]

**Output:** 3

**Explanation:**

The strictly increasing subarrays of `nums` are `[3]`, `[2]`, and `[1]`.

The strictly decreasing subarrays of `nums` are `[3]`, `[2]`, `[1]`, `[3,2]`, `[2,1]`, and `[3,2,1]`.

Hence, we return `3`.

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 50`

	- `1 &lt;= nums[i] &lt;= 50`

---
