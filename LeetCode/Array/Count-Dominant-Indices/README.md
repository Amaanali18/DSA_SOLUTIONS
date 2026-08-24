# Count Dominant Indices

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/count-dominant-indices/submissions/2117937214/](https://leetcode.com/problems/count-dominant-indices/submissions/2117937214/) |
| **Problem ID** | count-dominant-indices |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 46116000 MB |
| **Accepted At** | 2026-08-24T02:58:18.000Z |

## Tags

`Array`, `Enumeration`

## Problem Statement

You are given an integer array `nums` of length `n`.

An element at index `i` is called **dominant** if: `nums[i] &gt; average(nums[i + 1], nums[i + 2], ..., nums[n - 1])`

Your task is to count the number of indices `i` that are **dominant**.

The **average** of a set of numbers is the value obtained by adding all the numbers together and dividing the sum by the total number of numbers.

**Note**: The **rightmost** element of any array is **not** **dominant**.

&nbsp;

Example 1:**

**Input:** nums = [5,4,3]

**Output:** 2

**Explanation:**

	- At index `i = 0`, the value 5 is dominant as `5 &gt; average(4, 3) = 3.5`.

	- At index `i = 1`, the value 4 is dominant over the subarray `[3]`.

	- Index `i = 2` is not dominant as there are no elements to its right. Thus, the answer is 2.

Example 2:**

**Input:** nums = [4,1,2]

**Output:** 1

**Explanation:**

	- At index `i = 0`, the value 4 is dominant over the subarray `[1, 2]`.

	- At index `i = 1`, the value 1 is not dominant.

	- Index `i = 2` is not dominant as there are no elements to its right. Thus, the answer is 1.

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 100`

	- `1 &lt;= nums[i] &lt;= 100`​​​​​​​

---
