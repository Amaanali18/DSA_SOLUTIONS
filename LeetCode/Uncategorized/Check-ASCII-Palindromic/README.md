# Check ASCII Palindromic

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/check-ascii-palindromic/submissions/2117275518/](https://leetcode.com/problems/check-ascii-palindromic/submissions/2117275518/) |
| **Problem ID** | check-ascii-palindromic |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 43660000 MB |
| **Accepted At** | 2026-08-23T11:32:18.000Z |

## Problem Statement

You are given a string `s` consisting of lowercase English letters.

Construct a **binary string** by replacing each character in `s` with the 8-bit binary representation of its ASCII value, **including leading zeros**, while preserving the original order of the characters.

Return `true` if the resulting binary string is a **palindrome**. Otherwise, return `false`.

&nbsp;

Example 1:**

**Input:** s = &quot;ff&quot;

**Output:** true

**Explanation:**

	- The ASCII value of `f` is 102, whose 8-bit binary representation is `01100110`.

	- Thus, the binary string is `0110011001100110`.

	- Since this binary string is a **palindrome**, the output is `true`.

Example 2:**

**Input:** s = &quot;leet&quot;

**Output:** false

**Explanation:**

	- The ASCII values of `l`, `e`, `e`, and `t` are 108, 101, 101, and 116, respectively.

	- Their 8-bit binary representations are `01101100`, `01100101`, `01100101`, and `01110100`.

	- Thus, the binary string is `01101100011001010110010101110100`.

	- Since this binary string is not a **palindrome**, the output is `false`.

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 100`

	- `s` consists of lowercase English letters.

---
