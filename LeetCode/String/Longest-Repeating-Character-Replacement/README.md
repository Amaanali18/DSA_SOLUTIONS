# Longest Repeating Character Replacement

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/longest-repeating-character-replacement/submissions/2175086774/](https://leetcode.com/problems/longest-repeating-character-replacement/submissions/2175086774/) |
| **Problem ID** | longest-repeating-character-replacement |
| **Language** | Java |
| **Runtime** | 10 ms |
| **Memory** | 45868000 MB |
| **Accepted At** | 2026-10-18T04:08:18.000Z |

## Tags

`Hash Table`, `String`, `Sliding Window`

## Problem Statement

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return *the length of the longest substring containing the same letter you can get after performing the above operations*.

&nbsp;

Example 1:**

```

**Input:** s = &quot;ABAB&quot;, k = 2
**Output:** 4
**Explanation:** Replace the two &#39;A&#39;s with two &#39;B&#39;s or vice versa.

```

Example 2:**

```

**Input:** s = &quot;AABABBA&quot;, k = 1
**Output:** 4
**Explanation:** Replace the one &#39;A&#39; in the middle with &#39;B&#39; and form &quot;AABBBBA&quot;.
The substring &quot;BBBB&quot; has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 105`

	- `s` consists of only uppercase English letters.

	- `0 &lt;= k &lt;= s.length`

---
