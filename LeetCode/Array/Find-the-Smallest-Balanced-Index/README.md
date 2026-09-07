# Find the Smallest Balanced Index

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/find-the-smallest-balanced-index/submissions/2133960266/](https://leetcode.com/problems/find-the-smallest-balanced-index/submissions/2133960266/) |
| **Problem ID** | find-the-smallest-balanced-index |
| **Language** | Java |
| **Runtime** | 3 ms |
| **Memory** | 143236000 MB |
| **Accepted At** | 2026-09-07T14:03:06.000Z |

## Tags

`Array`, `Prefix Sum`

## Problem Statement

You are given an integer array `nums`.

An index `i` is **balanced** if the sum of elements **strictly** to the left of `i` equals the product of elements **strictly** to the right of `i`.

If there are no elements to the left, the sum is considered as 0. Similarly, if there are no elements to the right, the product is considered as 1.

Return an integer denoting the **smallest** balanced index. If no balanced index exists, return -1.

&nbsp;

Example 1:**

**Input:** nums = [2,1,2]

**Output:** 1

**Explanation:**

For index `i = 1`:

	- Left sum = `nums[0] = 2`

	- Right product = `nums[2] = 2`

	- Since the left sum equals the right product, index 1 is balanced.

No smaller index satisfies the condition, so the answer is 1.

Example 2:**

**Input:** nums = [2,8,2,2,5]

**Output:** 2

**Explanation:**

For index `i = 2`:

	- Left sum = `2 + 8 = 10`

	- Right product = `2 * 5 = 10`

	- Since the left sum equals the right product, index 2 is balanced.

No smaller index satisfies the condition, so the answer is 2.

Example 3:**

**Input:** nums = [1]

**Output:** -1
For index `i = 0`:

	- The left side is empty, so the left sum is 0.

	- The right side is empty, so the right product is 1.

	- Since the left sum does not equal the right product, index 0 is not balanced.

Therefore, no balanced index exists and the answer is -1.

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 105`

	- `1 &lt;= nums[i] &lt;= 109`

---
