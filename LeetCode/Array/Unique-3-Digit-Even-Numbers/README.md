# Unique 3-Digit Even Numbers

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/unique-3-digit-even-numbers/submissions/2138275170/?envType=daily-question&envId=2026-09-11](https://leetcode.com/problems/unique-3-digit-even-numbers/submissions/2138275170/?envType=daily-question&envId=2026-09-11) |
| **Problem ID** | unique-3-digit-even-numbers |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 44072000 MB |
| **Accepted At** | 2026-09-11T06:50:46.000Z |

## Tags

`Array`, `Hash Table`, `Recursion`, `Enumeration`

## Problem Statement

You are given an array of digits called `digits`. Your task is to determine the number of **distinct** three-digit even numbers that can be formed using these digits.

**Note**: Each *copy* of a digit can only be used **once per number**, and there may **not** be leading zeros.

&nbsp;

Example 1:**

**Input:** digits = [1,2,3,4]

**Output:** 12

**Explanation:** The 12 distinct 3-digit even numbers that can be formed are 124, 132, 134, 142, 214, 234, 312, 314, 324, 342, 412, and 432. Note that 222 cannot be formed because there is only 1 copy of the digit 2.

Example 2:**

**Input:** digits = [0,2,2]

**Output:** 2

**Explanation:** The only 3-digit even numbers that can be formed are 202 and 220. Note that the digit 2 can be used twice because it appears twice in the array.

Example 3:**

**Input:** digits = [6,6,6]

**Output:** 1

**Explanation:** Only 666 can be formed.

Example 4:**

**Input:** digits = [1,3,5]

**Output:** 0

**Explanation:** No even 3-digit numbers can be formed.

&nbsp;

**Constraints:**

	- `3 &lt;= digits.length &lt;= 10`

	- `0 &lt;= digits[i] &lt;= 9`

---
