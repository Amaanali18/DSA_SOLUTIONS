# Decode String

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/decode-string/submissions/2192529100/](https://leetcode.com/problems/decode-string/submissions/2192529100/) |
| **Problem ID** | decode-string |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 42140000 MB |
| **Accepted At** | 2026-11-09T14:16:03.000Z |

## Tags

`String`, `Stack`, `Recursion`

## Problem Statement

Given an encoded string, return its decoded string.

The encoding rule is: `k[encoded_string]`, where the `encoded_string` inside the square brackets is being repeated exactly `k` times. Note that `k` is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, `k`. For example, there will not be input like `3a` or `2[4]`.

The test cases are generated so that the length of the output will never exceed `105`.

&nbsp;

Example 1:**

```

**Input:** s = &quot;3[a]2[bc]&quot;
**Output:** &quot;aaabcbc&quot;

```

Example 2:**

```

**Input:** s = &quot;3[a2[c]]&quot;
**Output:** &quot;accaccacc&quot;

```

Example 3:**

```

**Input:** s = &quot;2[abc]3[cd]ef&quot;
**Output:** &quot;abcabccdcdcdef&quot;

```

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 30`

	- `s` consists of lowercase English letters, digits, and square brackets `&#39;[]&#39;`.

	- `s` is guaranteed to be **a valid** input.

	- All the integers in `s` are in the range `[1, 300]`.

## Constraints

- 1 &lt;= s.length &lt;= 30
- s consists of lowercase English letters, digits, and square brackets &#39;[]&#39;.

---
