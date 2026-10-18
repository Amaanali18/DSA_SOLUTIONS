# Longest Substring with At Least K Repeating Characters

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/submissions/2175067622/](https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/submissions/2175067622/) |
| **Problem ID** | longest-substring-with-at-least-k-repeating-characters |
| **Language** | Java |
| **Runtime** | 70 ms |
| **Memory** | 47624000 MB |
| **Accepted At** | 2026-10-18T03:45:58.000Z |

## Tags

`Hash Table`, `String`, `Divide and Conquer`, `Sliding Window`

## Problem Statement

Given a string `s` and an integer `k`, return *the length of the longest substring of* `s` *such that the frequency of each character in this substring is greater than or equal to* `k`.

if no such substring exists, return 0.

&nbsp;

Example 1:**

```

**Input:** s = &quot;aaabb&quot;, k = 3
**Output:** 3
**Explanation:** The longest substring is &quot;aaa&quot;, as &#39;a&#39; is repeated 3 times.

```

Example 2:**

```

**Input:** s = &quot;ababbc&quot;, k = 2
**Output:** 5
**Explanation:** The longest substring is &quot;ababb&quot;, as &#39;a&#39; is repeated 2 times and &#39;b&#39; is repeated 3 times.

```

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 104`

	- `s` consists of only lowercase English letters.

	- `1 &lt;= k &lt;= 105`

---
