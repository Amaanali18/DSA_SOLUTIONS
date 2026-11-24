# Maximum Subarray With Equal Products

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/maximum-subarray-with-equal-products/submissions/2202637473/?envType=daily-question&envId=2026-11-24](https://leetcode.com/problems/maximum-subarray-with-equal-products/submissions/2202637473/?envType=daily-question&envId=2026-11-24) |
| **Problem ID** | maximum-subarray-with-equal-products |
| **Language** | Java |
| **Runtime** | 6 ms |
| **Memory** | 43228000 MB |
| **Accepted At** | 2026-11-24T14:27:01.000Z |

## Tags

`Array`, `Math`, `Sliding Window`, `Enumeration`, `Number Theory`

## Problem Statement

You are given an array of **positive** integers `nums`.

An array `arr` is called **product equivalent** if `prod(arr) == lcm(arr) * gcd(arr)`, where:

	- `prod(arr)` is the product of all elements of `arr`.

	- `gcd(arr)` is the GCD of all elements of `arr`.

	- `lcm(arr)` is the LCM of all elements of `arr`.

Return the length of the **longest** **product equivalent** subarray of `nums`.

&nbsp;

Example 1:**

**Input:** nums = [1,2,1,2,1,1,1]

**Output:** 5

**Explanation:**&nbsp;

The longest product equivalent subarray is `[1, 2, 1, 1, 1]`, where&nbsp;`prod([1, 2, 1, 1, 1]) = 2`,&nbsp;`gcd([1, 2, 1, 1, 1]) = 1`, and&nbsp;`lcm([1, 2, 1, 1, 1]) = 2`.

Example 2:**

**Input:** nums = [2,3,4,5,6]

**Output:** 3

**Explanation:**&nbsp;

The longest product equivalent subarray is `[3, 4, 5].`

Example 3:**

**Input:** nums = [1,2,3,1,4,5,1]

**Output:** 5

&nbsp;

**Constraints:**

	- `2 &lt;= nums.length &lt;= 100`

	- `1 &lt;= nums[i] &lt;= 10`

---
