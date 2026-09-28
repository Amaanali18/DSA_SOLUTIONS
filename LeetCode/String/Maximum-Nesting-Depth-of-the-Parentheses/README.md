# Maximum Nesting Depth of the Parentheses

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/submissions/2155491822/?envType=daily-question&envId=2026-09-28](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/submissions/2155491822/?envType=daily-question&envId=2026-09-28) |
| **Problem ID** | maximum-nesting-depth-of-the-parentheses |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 42920000 MB |
| **Accepted At** | 2026-09-28T03:10:51.000Z |

## Tags

`String`, `Stack`, `Bracket Sequences`

## Problem Statement

Given a **valid parentheses string** `s`, return the **nesting depth** of* *`s`. The nesting depth is the **maximum** number of nested parentheses.

&nbsp;

Example 1:**

**Input:** s = &quot;(1+(2*3)+((8)/4))+1&quot;

**Output:** 3

**Explanation:**

Digit 8 is inside of 3 nested parentheses in the string.

Example 2:**

**Input:** s = &quot;(1)+((2))+(((3)))&quot;

**Output:** 3

**Explanation:**

Digit 3 is inside of 3 nested parentheses in the string.

Example 3:**

**Input:** s = &quot;()(())((()()))&quot;

**Output:** 3

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 100`

	- `s` consists of digits `0-9` and characters `&#39;+&#39;`, `&#39;-&#39;`, `&#39;*&#39;`, `&#39;/&#39;`, `&#39;(&#39;`, and `&#39;)&#39;`.

	- It is guaranteed that parentheses expression `s` is a VPS.

---
