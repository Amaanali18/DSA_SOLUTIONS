# Count Rotations With Exactly K Equal Adjacent Pairs

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/count-rotations-with-exactly-k-equal-adjacent-pairs/submissions/2132506653/](https://leetcode.com/problems/count-rotations-with-exactly-k-equal-adjacent-pairs/submissions/2132506653/) |
| **Problem ID** | count-rotations-with-exactly-k-equal-adjacent-pairs |
| **Language** | Java |
| **Runtime** | 15 ms |
| **Memory** | 44044000 MB |
| **Accepted At** | 2026-09-06T06:03:56.000Z |

## Problem Statement

You are given a string `s` of length `n` and an integer `k`.

A **cyclic rotation** of `s` is obtained by choosing a **prefix** of `s` whose length is between 0 and `n - 1` (inclusive), and moving it to the end of the string while preserving the order of all characters.

For **every** cyclic rotation of `s`, let its **score** be the number of indices `i` such that `0 &lt;= i &lt; n - 1` and the characters at positions `i` and `i + 1` are equal.

Return the number of cyclic rotations of `s` whose score equals `k`.

A **prefix** of a string is a substring that starts from the beginning of the string and extends to any point within it.

A **substring** is a contiguous sequence of characters within a string, which may be empty.

&nbsp;

Example 1:**

**Input:** s = &quot;aab&quot;, k = 1

**Output:** 2

**Explanation:**

The cyclic rotations of `s` are:

	- `&quot;aab&quot;`: The characters at positions 0 and 1 are equal, so `score = 1`.

	- `&quot;aba&quot;`: No two adjacent characters are equal, so `score = 0`.

	- `&quot;baa&quot;`: The characters at positions 1 and 2 are equal, so `score = 1`.

Since `score` equals `k` for 2 cyclic rotations of `s`, the answer is 2.

Example 2:**

**Input:** s = &quot;abca&quot;, k = 0

**Output:** 1

**Explanation:**

The cyclic rotations of `s` are:

	- `&quot;abca&quot;`: No two adjacent characters are equal, so `score = 0`.

	- `&quot;bcaa&quot;`: The characters at positions 2 and 3 are equal, so `score = 1`.

	- `&quot;caab&quot;`: The characters at positions 1 and 2 are equal, so `score = 1`.

	- `&quot;aabc&quot;`: The characters at positions 0 and 1 are equal, so `score = 1`.

Since `score` equals `k` for only 1 cyclic rotation of `s`, the answer is 1.

&nbsp;

**Constraints:**

	- `2 &lt;= n == s.length &lt;= 100`

	- `s` only consists of lowercase English letters.

	- `0 &lt;= k &lt;= n - 1`

---
