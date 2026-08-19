# Find Valid Pair of Adjacent Digits in String

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string/submissions/2112249408/](https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string/submissions/2112249408/) |
| **Problem ID** | find-valid-pair-of-adjacent-digits-in-string |
| **Language** | Java |
| **Runtime** | 5 ms |
| **Memory** | 44580000 MB |
| **Accepted At** | 2026-08-19T05:20:29.000Z |

## Tags

`Hash Table`, `String`, `Counting`

## Problem Statement

You are given a string `s` consisting only of digits. A **valid pair** is defined as two **adjacent** digits in `s` such that:

	- The first digit is **not equal** to the second.

	- Each digit in the pair appears in `s` **exactly** as many times as its numeric value.

Return the first **valid pair** found in the string `s` when traversing from left to right. If no valid pair exists, return an empty string.

&nbsp;

Example 1:**

**Input:** s = &quot;2523533&quot;

**Output:** &quot;23&quot;

**Explanation:**

Digit `&#39;2&#39;` appears 2 times and digit `&#39;3&#39;` appears 3 times. Each digit in the pair `&quot;23&quot;` appears in `s` exactly as many times as its numeric value. Hence, the output is `&quot;23&quot;`.

Example 2:**

**Input:** s = &quot;221&quot;

**Output:** &quot;21&quot;

**Explanation:**

Digit `&#39;2&#39;` appears 2 times and digit `&#39;1&#39;` appears 1 time. Hence, the output is `&quot;21&quot;`.

Example 3:**

**Input:** s = &quot;22&quot;

**Output:** &quot;&quot;

**Explanation:**

There are no valid adjacent pairs.

&nbsp;

**Constraints:**

	- `2 &lt;= s.length &lt;= 100`

	- `s` only consists of digits from `&#39;1&#39;` to `&#39;9&#39;`.

---
