# Maximize Sum of Squares of Digits

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/maximize-sum-of-squares-of-digits/submissions/2172188880/?envType=daily-question&envId=2026-10-14](https://leetcode.com/problems/maximize-sum-of-squares-of-digits/submissions/2172188880/?envType=daily-question&envId=2026-10-14) |
| **Problem ID** | maximize-sum-of-squares-of-digits |
| **Language** | Java |
| **Runtime** | 17 ms |
| **Memory** | 47796000 MB |
| **Accepted At** | 2026-10-14T14:06:45.000Z |

## Tags

`Math`, `Greedy`

## Problem Statement

You are given two **positive** integers `num` and `sum`.

A positive integer `n` is **good** if it satisfies both of the following:

	- The number of digits in `n` is **exactly** `num`.

	- The sum of digits in `n` is **exactly** `sum`.

The **score** of a **good** integer `n` is the sum of the squares of digits in `n`.

Return a **string** denoting the **good** integer `n` that achieves the **maximum** **score**. If there are multiple possible integers, return the **maximum **​​​​​​​one. If no such integer exists, return an empty string.

&nbsp;

Example 1:**

**Input:** num = 2, sum = 3

**Output:** &quot;30&quot;

**Explanation:**

There are 3 good integers: 12, 21, and 30.

	- The score of 12 is `12 + 22 = 5`.

	- The score of 21 is `22 + 12 = 5`.

	- The score of 30 is `32 + 02 = 9`.

The maximum score is 9, which is achieved by the good integer 30. Therefore, the answer is `&quot;30&quot;`.

Example 2:**

**Input:** num = 2, sum = 17

**Output:** &quot;98&quot;

**Explanation:**

There are 2 good integers: 89 and 98.

	- The score of 89 is `82 + 92 = 145`.

	- The score of 98 is `92 + 82 = 145`.

The maximum score is 145. The maximum good integer that achieves this score is 98. Therefore, the answer is `&quot;98&quot;`.

Example 3:**

**Input:** num = 1, sum = 10

**Output:** &quot;&quot;

**Explanation:**

There are no integers that have exactly 1 digit and whose digits sum to 10. Therefore, the answer is `&quot;&quot;`.

&nbsp;

**Constraints:**

	- `1 &lt;= num &lt;= 2 * 105`

	- `1 &lt;= sum &lt;= 2 * 106`

---
