# Longest Subsequence With Non-Zero Bitwise XOR

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/submissions/2107236456/?envType=daily-question&envId=2026-08-15](https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/submissions/2107236456/?envType=daily-question&envId=2026-08-15) |
| **Problem ID** | longest-subsequence-with-non-zero-bitwise-xor |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 133660000 MB |
| **Accepted At** | 2026-08-15T05:14:02.000Z |

## Tags

`Array`, `Bit Manipulation`

## Problem Statement

You are given an integer array `nums`.

Return the length of the **longest subsequence** in `nums` whose bitwise **XOR** is **non-zero**. If no such **subsequence** exists, return 0.

&nbsp;

Example 1:**

**Input:** nums = [1,2,3]

**Output:** 2

**Explanation:**

One longest subsequence is `[2, 3]`. The bitwise XOR is computed as `2 XOR 3 = 1`, which is non-zero.

Example 2:**

**Input:** nums = [2,3,4]

**Output:** 3

**Explanation:**

The longest subsequence is `[2, 3, 4]`. The bitwise XOR is computed as `2 XOR 3 XOR 4 = 5`, which is non-zero.

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 105`

	- `0 &lt;= nums[i] &lt;= 109`

---
