# Find the Encrypted String

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/find-the-encrypted-string/submissions/2109879543/](https://leetcode.com/problems/find-the-encrypted-string/submissions/2109879543/) |
| **Problem ID** | find-the-encrypted-string |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 44020000 MB |
| **Accepted At** | 2026-08-17T08:19:33.000Z |

## Tags

`String`

## Problem Statement

You are given a string `s` and an integer `k`. Encrypt the string using the following algorithm:

	- For each character `c` in `s`, replace `c` with the `kth` character after `c` in the string (in a cyclic manner).

Return the *encrypted string*.

&nbsp;

Example 1:**

**Input:** s = &quot;dart&quot;, k = 3

**Output:** &quot;tdar&quot;

**Explanation:**

	- For `i = 0`, the 3rd character after `&#39;d&#39;` is `&#39;t&#39;`.

	- For `i = 1`, the 3rd character after `&#39;a&#39;` is `&#39;d&#39;`.

	- For `i = 2`, the 3rd character after `&#39;r&#39;` is `&#39;a&#39;`.

	- For `i = 3`, the 3rd character after `&#39;t&#39;` is `&#39;r&#39;`.

Example 2:**

**Input:** s = &quot;aaa&quot;, k = 1

**Output:** &quot;aaa&quot;

**Explanation:**

As all the characters are the same, the encrypted string will also be the same.

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 100`

	- `1 &lt;= k &lt;= 104`

	- `s` consists only of lowercase English letters.

---
